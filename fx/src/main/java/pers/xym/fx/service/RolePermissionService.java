package pers.xym.fx.service;

import pers.xym.fx.domain.RolePermissionKey;

/**
 * 角色权限关系service
 * 
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
public interface RolePermissionService {
	/**
	 * 添加角色权限关系
	 * 
	 * @param key
	 *            {@link pers.xym.fx.domain.RolePermissionKey} 角色权限关系
	 * @return 
	 */
	boolean addKey(RolePermissionKey key);

	/**
	 * 删除角色权限关系
	 * @param key
	 * @return
	 */
	boolean delKey(RolePermissionKey key);
}
