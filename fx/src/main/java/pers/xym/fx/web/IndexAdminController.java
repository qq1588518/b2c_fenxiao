package pers.xym.fx.web;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import pers.xym.fx.domain.Administrator;
import pers.xym.fx.util.ResponseJson;


/**
 * 后台首页Controller
 * @author 徐一鸣
 * @date 2017年8月18日
 *
 */
@RestController
@SessionAttributes("administrator")
public class IndexAdminController extends BaseAdminController {

	@RequestMapping("/admin")
	@RequiresAuthentication
	public ResponseJson index(@SessionAttribute Administrator administrator) {
		return null;
	}
}
