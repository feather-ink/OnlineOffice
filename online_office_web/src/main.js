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

import {postRequest} from "./utils/api";
import {putRequest} from "./utils/api";
import {getRequest} from "./utils/api";
import {deleteRequest} from "./utils/api";
// import {downloadRequest} from "./utils/download";
// import {initMenu} from "./utils/menus";
//插件
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.getRequest = getRequest;
Vue.prototype.deleteRequest = deleteRequest;
// Vue.prototype.downloadRequest = downloadRequest;

//  程序入口
new Vue({
  router,
  render: h => h(App)
// 手动挂载vue.app
}).$mount('#app')
