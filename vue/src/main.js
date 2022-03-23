import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/theme-chalk/index.css'
import zhCn from 'element-plus/es/locale/lang/zh-cn'
import axios from "axios";

import '@/assets/CSS/global.css'

createApp(App).use(store).use(router).use(ElementPlus).use(ElementPlus, {locale: zhCn, size: 'small'}).mount('#app')

const service = axios.create({
    baseURL: 'http://127.0.0.1:8080',
    timeout: 5000
})