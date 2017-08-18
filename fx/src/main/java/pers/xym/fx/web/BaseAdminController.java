package pers.xym.fx.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import pers.xym.fx.util.ResponseJson;

/**
 * 后台基础Controller
 * @author 徐一鸣
 * @date 2017年8月18日
 *
 */
@RestController
public class BaseAdminController {

	@ExceptionHandler
	public ResponseJson handleException(Exception e) {
		ResponseJson responseJson = new ResponseJson();
		
		if (e instanceof ) {
			
		}
	}
}
