// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import VueWordcloud from 'vue-b2wordcloud'
import element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
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
