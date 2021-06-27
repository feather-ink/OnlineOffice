import axios from "axios";
import { Message } from 'element-ui';
import router from "../src/router";

// interceptors 响应拦截器
axios.interceptors.response.use(success => {
    // 业务逻辑错误
    if (success.status && success.status == 200) {
        if (success.data.code == 500 || success.data.code == 401 || success.data.code == 403) {
            Message.error({message: success.data.message});
            return;
        }
        if(success.data.message) {
            Message.success({message: success.data.message});
        }
    }
    return data;

}, error => {
    if (error.response.code == 504 || error.response.code == 404) {
        Message.error({message: "服务器被吃了/(ㄒoㄒ)/~~"});
    } else if (error.response.code == 403) {
        Message.error({message: "权限不足，请联系管理员！ "})
    } else if (error.response.code == 401) {
        Message.error({message: "尚未登录，请登录！"});
        // 跳转登录界面
        router.replace('/');
    } else {
        if (error.response.data.message) {
            Message.error({message: error.data.message})
        } else {
            Message.error({message: "未知错误！ "})
        }
    }
})
