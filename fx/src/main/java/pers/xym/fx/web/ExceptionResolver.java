package pers.xym.fx.web;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import pers.xym.fx.exception.UsernameExists;
import pers.xym.fx.util.ResponseJson;
import pers.xym.fx.util.ReturnCode;

/**
 * 异常Resolver
 * @author 徐一鸣
 * @date 2017年8月21日
 *
 */
@ControllerAdvice
@RestController
public class ExceptionResolver {
	
	/**
	 * 解决异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler
	public ResponseJson handleException(Exception e) {
		e.printStackTrace();
		if (e instanceof UnauthenticatedException) {
			return new ResponseJson(false, ReturnCode.NEED_LOGIN, "请登录");
		}else if (e instanceof IncorrectCredentialsException) {
			return new ResponseJson(false, ReturnCode.PASSWORD_INCORRECT, "密码错误");
		}else if (e instanceof UnknownAccountException) {
			return new ResponseJson(false, ReturnCode.USER_NOT_FOUND, "用户不存在");
		}else if (e instanceof UsernameExists) {
			return new ResponseJson(false, ReturnCode.USERNAME_EXISTS, "用户名已存在");
		} else {
			return new ResponseJson(false, ReturnCode.UNKNOW_ERROR, "唔，出现了一个意料之外的技术错误，或许你可以稍后重试操作");
		}
	}
}
