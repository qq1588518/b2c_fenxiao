package pers.xym.fx.service;

import java.util.List;

import pers.xym.fx.domain.Permission;

/**
 * 权限service
 * 
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
public interface PermissionService {
	/**
	 * 权限列表
	 * 
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	List<Permission> listPermission();
}
