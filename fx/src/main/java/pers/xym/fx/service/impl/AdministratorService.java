package pers.xym.fx.service.impl;

import java.util.List;
import java.util.Map;

import pers.xym.fx.domain.Administrator;

/**
 * 管理员service
 * @author 徐一鸣
 * @date 2017年8月7日
 *
 */
public interface AdministratorService {
	List<Administrator> listAdministrator(Map<String, String> map, int page, int pageSize)
}
