import Vue from 'vue'
import VueRouter from 'vue-router'
import Pie from '../views/Pie'
import Bar from '../views/Bar'
import Table from "../views/Table"
import Edit from "../views/Edit";
import Add from '../views/Add'
import Home from '../views/Home'
import About from '../views/About'

Vue.use(VueRouter)

const routes = [
    {
        path: '/home',
        name:'Home',
        component: Home
    },
    {
        path: '/bar',
        name:'Bar',
        component: () => import('../views/Bar')
    },
    {
        path: '/pie',
        name:'Pie',
        component: () => import('../views/Pie')
    },
    {
        path: '/table',
        name:'Table',
        component: () => import('../views/Table')
    },
    {
        path: '/edit',
        name:'Edit',
        component: () => import('../views/Edit')
    },
    {
        path: '/add',
        name:'add',
        component: () => import('../views/Add')
    },
    {
        path: '/about',
        name:'About',
        component: () => import('../views/About')
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
