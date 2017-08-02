package pers.xym.fx.service.impl;

import java.util.List;
import java.util.Map;

import pers.xym.fx.domain.User;

/**
 * 用户service
 * 
 * @author 徐一鸣
 * @date 2017年8月2日
 *
 */
public interface UserService {
	/**
	 * 根据条件分页查询用户
	 * 
	 * @param condition
	 *            查询条件
	 * @param page
	 *            页码
	 * @param pageSize
	 *            每页容量 0为默认
	 * @return 查询到的用户列表
	 */
	public List<User> listUser(Map<String, String> condition, int page, int pageSize);
	
}
