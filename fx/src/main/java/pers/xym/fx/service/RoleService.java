package pers.xym.fx.service;

import java.util.List;

import pers.xym.fx.domain.Role;

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
	 * @return
	 */
	List<Role> listRole(int page, int pageSize);
	/**
	 * 
	 * @param role
	 * @return
	 */
	boolean addRole(Role role);
	/**
	 * 
	 * @param role
	 * @return
	 */
	boolean updateRole(Role role);
	/**
	 * 
	 * @param id
	 * @return
	 */
	boolean deleteRole(int id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Role getRole(int id);
}
