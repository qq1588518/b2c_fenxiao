package pers.xym.fx.service;

import pers.xym.fx.domain.Administrator;
import pers.xym.fx.exception.UsernameExists;
import pers.xym.fx.util.Page;

/**
 * 管理员service
 * 
 * @author 徐一鸣
 * @date 2017年8月7日
 *
 */
public interface AdministratorService {
	/**
	 * 管理员列表
	 * 
	 * @param page
	 *            页码
	 * @param pageSize
	 *            每页容量 0为默认
	 * @return {@link pers.xym.fx.util.Page}
	 */
	Page<Administrator> listAdministrator(int page, int pageSize);

	/**
	 * 管理员列表
	 * 
	 * @param condiition
	 *            查询条件
	 * @param page
	 *            页码
	 * @param pageSize
	 *            每页容量 0为默认
	 * @return {@link pers.xym.fx.util.Page}
	 */
	Page<Administrator> listAdministrator(Administrator administrator, int page, int pageSize);

	/**
	 * 添加管理员
	 * 
	 * @param administrator
	 *            管理员信息
	 * @return
	 */
	boolean addAdministrator(Administrator administrator) throws UsernameExists;

	/**
	 * 更改管理员信息
	 * 
	 * @param administrator
	 *            更改之后的管理员信息 （id不可修改）
	 * @return
	 */
	boolean updateAdministrator(Administrator administrator);

	/**
	 * 删除管理员
	 * 
	 * @param id
	 *            管理员id
	 * @return
	 */
	boolean deleteAdministrator(int id);

	/**
	 * 查找管理员
	 * 
	 * @param condition
	 *            查询条件
	 * @return
	 */
	Administrator findAdministrator(Administrator administrator);

	/**
	 * 获取管理员
	 * 
	 * @param id
	 *            管理员id
	 * @return
	 */
	Administrator getAdministrator(int id);

	/**
	 * 登录
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws UserNotFoundException
	 */
	void login(String username, String password, boolean rememberMe);
}
