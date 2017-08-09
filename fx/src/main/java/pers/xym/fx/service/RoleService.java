package pers.xym.fx.service;

import pers.xym.fx.domain.Role;
import pers.xym.fx.util.ResponseJson;

/**
 * 角色service
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
public interface RoleService {
	/**
	 * 
	 * @param page
	 * @param pageSize
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson listRole(int page, int pageSize);
	/**
	 * 
	 * @param role
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson addRole(Role role);
	/**
	 * 
	 * @param role
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson updateRole(Role role);
	/**
	 * 
	 * @param id
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson deleteRole(int id);
	/**
	 * 
	 * @param id
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson getRole(int id);
}
