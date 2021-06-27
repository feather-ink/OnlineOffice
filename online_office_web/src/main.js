import Vue from 'vue'
import App from './App.vue'
import router from './router'

// 引入element-ui
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

// 关闭游览器控制台相关提示
Vue.config.productionTip = false

// 安装element-ui
Vue.use(ElementUI)

//  程序入口
new Vue({
  router,
  render: h => h(App)
// 手动挂载vue.app
}).$mount('#app')
