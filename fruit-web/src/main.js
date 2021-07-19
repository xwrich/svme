import Vue from 'vue'
import App from './App.vue'
import store from './store'
import router from './router'
import axios from "axios";

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import echarts from 'echarts'




Vue.config.productionTip = false
Vue.prototype.axios = axios
Vue.use(ElementUI)
Vue.prototype.$echarts = echarts

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')
