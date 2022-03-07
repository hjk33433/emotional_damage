// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import VueWordcloud from 'vue-b2wordcloud'
import element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import {getRequest, postRequest, deleteRequest, putRequest} from './http/http'
Vue.prototype.getRequest = getRequest
Vue.prototype.postRequest = postRequest
Vue.prototype.deleteRequest = deleteRequest
Vue.prototype.putRequest = putRequest

Vue.use(VueWordcloud)
Vue.use(element)
Vue.config.productionTip = false
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
