
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClassManager from "./components/listers/ClassCards"
import ClassDetail from "./components/listers/ClassDetail"

import EnrollmentManager from "./components/listers/EnrollmentCards"
import EnrollmentDetail from "./components/listers/EnrollmentDetail"

import StudentManager from "./components/listers/StudentCards"
import StudentDetail from "./components/listers/StudentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/classes',
                name: 'ClassManager',
                component: ClassManager
            },
            {
                path: '/classes/:id',
                name: 'ClassDetail',
                component: ClassDetail
            },

            {
                path: '/enrollments',
                name: 'EnrollmentManager',
                component: EnrollmentManager
            },
            {
                path: '/enrollments/:id',
                name: 'EnrollmentDetail',
                component: EnrollmentDetail
            },

            {
                path: '/students',
                name: 'StudentManager',
                component: StudentManager
            },
            {
                path: '/students/:id',
                name: 'StudentDetail',
                component: StudentDetail
            },



    ]
})
