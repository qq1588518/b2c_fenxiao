package pers.xym.fx.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.xym.fx.service.AdministratorService;
import pers.xym.fx.util.ResponseJson;
import pers.xym.fx.util.ReturnCode;

/**
 * 管理员Controller
 * 
 * @author 徐一鸣
 * @date 2017年8月24日
 *
 */
@RestController
public class AdministratorAdminController {
	private AdministratorService administratorService;

	public AdministratorService getAdministratorService() {
		return administratorService;
	}

	@Autowired
	public void setAdministratorService(AdministratorService administratorService) {
		this.administratorService = administratorService;
	}

	@RequestMapping("/admin/administrator/list/page/{$page}/pagesize/{$pageSize}")
	public ResponseJson listAdministrator(@PathVariable int page, @PathVariable int pageSize) {
		return new ResponseJson(true, ReturnCode.SUCCESS_CODE, "获取成功",
				administratorService.listAdministrator(page, pageSize));
	}
}
