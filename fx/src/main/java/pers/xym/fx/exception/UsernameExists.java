package pers.xym.fx.exception;

/**
 * 用户名已经存在
 * @author 徐一鸣
 * @date 2017年8月24日
 *
 */
public class UsernameExists extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1904122160842456490L;
	
	public UsernameExists(String info) {
		super(info);
	}
}
