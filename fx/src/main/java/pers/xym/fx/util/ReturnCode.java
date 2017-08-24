package pers.xym.fx.util;

/**
 * 返回值列表
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
public class ReturnCode {
	/**
	 * 操作成功
	 */
	public static final int SUCCESS_CODE = 100000;
	
	/**
	 * 需要登录
	 */
	public static final int NEED_LOGIN = 200001;
	
	/**
	 * 管理端未知错误
	 */
	public static final int UNKNOW_ERROR = 200500;
	
	/**
	 * 用户不存在
	 */
	public static final int USER_NOT_FOUND = 200002;
	
	/**
	 * 密码错误
	 */
	public static final int PASSWORD_INCORRECT = 200003;
	
	/**
	 * 用户名已存在
	 */
	public static final int USERNAME_EXISTS = 200004;
}
