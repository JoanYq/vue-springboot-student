import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Student from '@/components/Student'
import StuList1 from '../components/StuList1'
import StuAdd2 from '../components/StuAdd2'
import Page3 from '../components/Page3'
import Page4 from '../components/Page4'
// import App from '../App'
import Index from '../components/Index'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: "学生管理",
      component: Index,
      redirect:"/stulist",
      //  name: 'HelloWorld',
      //  component: HelloWorld
      children:[
        {
          path: '/stulist',
          name: "页面1-学生列表",
          component: StuList1
        },
        {
          path: '/stuadd',
          name: "页面2-添加学生",
          component: StuAdd2
        }
      ]
    },
    {
      path: '/navigation',
      name: "导航2",
      component: Index,
      children:[
        {
          path: '/page3',
          name: "页面3",
          component: Page3
        },
        {
          path: '/page4',
          name: "页面4",
          component: Page4
        }
      ]
    },
    {
      path: '/stu',
      name: "学生管理列表",
      component: Student
    },
    
  ]
})
