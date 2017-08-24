package pers.xym.fx.vo;

/**
 * 用户登录参数
 * 
 * @author 徐一鸣
 * @date 2017年8月22日
 *
 */
public class LoginUser {
	private String username;
	private String password;
	private boolean rememberMe;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
}