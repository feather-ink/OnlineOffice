<template>
    <div>
        <el-form ref="ruleForm"
                 :rules="rules"
                 :model="loginForm"
                 v-loading="loading"
                 class="loginContainer">
            <h3 class="loginTitle">系统登录</h3>
            <!-- prop 与校验规则对应上 -->
            <el-form-item prop="username">
                <el-input type="text" auto-complete="false" v-model="loginForm.username" placeholder="请输入用户名"></el-input>
            </el-form-item>
            <el-form-item prop="password">
                <el-input type="password" auto-complete="false" v-model="loginForm.password" placeholder="请输入密码"></el-input>
            </el-form-item>
            <el-form-item prop="code">
                <el-input type="text" auto-complete="false" v-model="loginForm.code" placeholder="点击图片更换验证码"
                style="width: 250px; margin-right: 5px"></el-input>
                <img :src = "captchaUrl" @click="updateCaptcha" alt = "验证码图片">
            </el-form-item>
            <el-checkbox v-model="checked" class="loginRemember">记住我</el-checkbox>
            <el-button type="primary" style="width: 100%" @click="submitLogin">登录</el-button>
        </el-form>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data(){
            return {
                captchaUrl: '/captcha?time=' + new Date(),
                loginForm: {
                   username: 'admin',
                   password: '123',
                   code: ''
                },
                checked: true,
                rules: {
                    //  required  要求必须填写
                    //  triangle: 'blur'   失去焦点的时候出发
                    username: [{required: true, message: "请输入用户名", triangle: 'blur'}],
                    password: [{required: true, message: "请输入密码", triangle: 'blur'}],
                    code: [{required: true, message: "请输入验证码", triangle: 'blur'}]
                }
            }
        },
        methods: {
            submitLogin() {
                this.$refs.ruleForm.validate((valid) => {
                    if (valid) {
                        this.loading = true;
                        this.postRequest('/login', this.loginForm).then(
                            resp => {
                                this.loading = false;
                                // JSON.stringify()
                                if (resp) {
                                    // 存储用户token
                                    const tokenStr = resp.obj.tokenHead + resp.obj.token;
                                    window.sessionStorage.setItem('tokenStr', tokenStr)
                                    // replace 不可回到上一页
                                    this.$router.replace('/home')
                                }
                            });
                    } else {
                        this.$message({
                            showClose: true,
                            message: '请输入所有字段！',
                            type: 'error'
                        });
                    }
                });
            },
            updateCaptcha() {
                this.captchaUrl = "/captcha?time=" + new Date();
            }
        }
    }
</script>

<style>
    .loginContainer {
        border-radius: 15px;
        background-clip: padding-box;
        margin: 180px auto;
        width: 350px;
        padding: 15px 35px;
        background: #ffffff;
        border: 1px solid #aaaaaa;
        box-shadow: 0 0 25px #cac6c6;
    }
    .loginTitle {
        margin: 10px auto 30px;
        text-align: center;
    }
    .loginRemember {
        text-align: left;
        margin: 0 0 15px 0;
    }
    .el-form-item__content {
        display: flex;
        align-items: center;
    }
</style>