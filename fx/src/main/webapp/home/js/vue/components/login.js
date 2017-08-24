const Login = {
	template: '\
		<div class="login-box">\
			<div class="login-logo">\
			  <b>B2C</b> 微信分销商城</a>\
			</div>\
			<!-- /.login-logo -->\
			<div id="loginBox" class="login-box-body">\
			  <p class="login-box-msg">登录</p>\
			    <div class="form-group has-feedback">\
			      <input v-model="username" type="text" class="form-control" placeholder="账号">\
			      <span class="glyphicon glyphicon-user form-control-feedback"></span>\
			    </div>\
			    <div class="form-group has-feedback">\
			      <input v-model="password" type="password" class="form-control" placeholder="密码">\
			      <span class="glyphicon glyphicon-lock form-control-feedback"></span>\
			    </div>\
			    <div class="row">\
			      <div class="col-xs-8">\
			        <div class="checkbox icheck">\
			          <label  style="margin-left:10px;">\
			            <input type="checkbox"> 记住密码\
			          </label>\
			        </div>\
			      </div>\
			      <!-- /.col -->\
			      <div class="col-xs-4">\
			        <button v-on:click="submit" type="button" class="btn btn-primary btn-block btn-flat">登录</button>\
			      </div>\
			      <!-- /.col -->\
			    </div>\
			  </form>\
			</div>\
			<!-- /.login-box-body -->\
		</div>',
	data: function() {
		return {
			username:"",
			password:"",
			rememberMe:false
		}
	},
	methods: {
		submit: function() {
			$.post(
				apiHead+"/admin/login",
				JSON.stringify({
					username: this.username,
					password: this.password,
					rememberMe: this.rememberMe
				}),
				function(data) {
					if(data.status) {
						layer.msg("登录成功")
						router.replace("/index")
					} else {
						handleException(data)
					}
				}
			)
		}
	}
}
