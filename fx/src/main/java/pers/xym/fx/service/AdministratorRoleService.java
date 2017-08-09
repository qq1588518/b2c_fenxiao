package pers.xym.fx.service;

import pers.xym.fx.domain.AdministratorRoleKey;
import pers.xym.fx.util.ResponseJson;

/**
 * 管理员角色关系service
 * 
 * @author 徐一鸣
 * @date 2017年8月9日
 *
 */
public interface AdministratorRoleService {
	/**
	 * 添加关系
	 * 
	 * @param key
	 *            {@link pers.xym.fx.domain.AdministratorRoleKey} 管理员角色关系
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson addKey(AdministratorRoleKey key);

	/**
	 * 删除关系
	 * 
	 * @param key
	 *            {@link pers.xym.fx.domain.AdministratorRoleKey} 管理员角色关系
	 * @return {@link pers.xym.fx.util.ResponseJson}
	 */
	ResponseJson delKey(AdministratorRoleKey key);
}
