package pers.xym.fx.util;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * Md5密码加密工具
 * @author 徐一鸣
 * @date 2017年8月22日
 *
 */
public class Md5PasswordUtil {
	/**
	 * 随机数生成工具
	 */
	private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	
	/**
	 * 加密次数
	 * !! 改动此项会使已经存在的密码失效 !!
	 */
	public static final int hashIterations = 2;
	
	/**
	 * 加密方式
	 * !! 改动此项会使已经存在的密码失效 !!
	 */
	public static final String hashAlgorithm = "md5";

	/**
	 * 生成salt
	 * @return
	 */
	public static String newSalt() {
		return randomNumberGenerator.nextBytes().toHex();
	}
	
	/**
	 * 加密密码
	 * @param password
	 * @param salt
	 * @return
	 */
	public static String hashPassword(String password, String salt) {
//		return new Md5Hash(password, salt, hashIterations).toHex();
		return new SimpleHash(hashAlgorithm, password, salt, hashIterations).toHex();
	}
}
