package pers.xym.fx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.xym.fx.domain.Administrator;
import pers.xym.fx.service.AdministratorService;
import pers.xym.fx.util.ResponseJson;
import pers.xym.fx.util.ReturnCode;
import pers.xym.fx.vo.LoginUser;

/**
 * 管理端登录Controller
 * 
 * @author 徐一鸣
 * @date 2017年8月21日
 *
 */
@RestController
public class LoginAdminController {
	private AdministratorService administratorService;

	public AdministratorService getAdministratorService() {
		return administratorService;
	}

	@Autowired
	public void setAdministratorService(AdministratorService administratorService) {
		this.administratorService = administratorService;
	}

	@RequestMapping("/admin/login")
	public ResponseJson login(@RequestBody LoginUser user) {
		administratorService.login(user.getUsername(), user.getPassword(), user.isRememberMe());
		return new ResponseJson(true, ReturnCode.SUCCESS_CODE, "登录成功");
	}
}
