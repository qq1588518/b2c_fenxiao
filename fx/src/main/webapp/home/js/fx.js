//  定义路由
// 每个路由应该映射一个组件。 其中"component" 可以是
// 通过 Vue.extend() 创建的组件构造器，
// 或者，只是一个组件配置对象。
// 我们晚点再讨论嵌套路由。
const routes = [
  { path: '/login', component: Login },
  { path: '/index', component: Index }
]

// 创建 router 实例，然后传 `routes` 配置
// 你还可以传别的配置参数, 不过先这么简单着吧。
const router = new VueRouter({
  routes // （缩写）相当于 routes: routes
})

// 用户
var administrator = {
	islogin:false,
	nickname : "",
	avatar : "img/nologin.jpg"
}

var apiHead = "/fx/api"

// 创建和挂载根实例。
// 记得要通过 router 配置参数注入路由，
// 从而让整个应用都有路由功能
const app = new Vue({
  router,
  data:administrator,
  mounted() {
	  $.ajaxSetup({
		  contentType: "application/json; charset=utf-8"
	  });
	  
	  $.get(apiHead+"/admin", function(data){
		  if(data.status) {
			  router.replace("/index")
		  } else {
			  handleException(data)
		  }
	  })
  }
}).$mount('#fx')

function handleException(data) {
	if (data.returnCode == 200001) {
		layer.msg("请登录")
		router.replace("/login")
	} else {
		if(data.memo != null && data.memo != '') {
			layer.msg(data.memo)
		}
	}
}
