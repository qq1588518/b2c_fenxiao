package pers.xym.fx.web;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.xym.fx.util.ResponseJson;
import pers.xym.fx.util.ReturnCode;

/**
 * 后台首页Controller
 * 
 * @author 徐一鸣
 * @date 2017年8月18日
 *
 */
@RestController
public class IndexAdminController {
	/**
	 * 进入网站首页
	 * @return
	 */
	@RequestMapping("/admin")
	@RequiresAuthentication
	public ResponseJson index() {
		return new ResponseJson(true, ReturnCode.SUCCESS_CODE);
	}
}
