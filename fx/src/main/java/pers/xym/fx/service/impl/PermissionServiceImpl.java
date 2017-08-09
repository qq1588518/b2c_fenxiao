package pers.xym.fx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.xym.fx.dao.PermissionMapper;
import pers.xym.fx.domain.Permission;
import pers.xym.fx.service.PermissionService;
import pers.xym.fx.util.ResponseJson;
import pers.xym.fx.util.ReturnCode;

@Service
public class PermissionServiceImpl implements PermissionService {
	/**
	 *  {@link pers.xym.fx.util.ResponseJson}
	 */
	private ResponseJson responseJson;
	private PermissionMapper permissionMapper;
	
	public ResponseJson getResponseJson() {
		return responseJson;
	}

	@Autowired
	public void setResponseJson(ResponseJson responseJson) {
		this.responseJson = responseJson;
	}

	public PermissionMapper getPermissionMapper() {
		return permissionMapper;
	}

	@Autowired
	public void setPermissionMapper(PermissionMapper permissionMapper) {
		this.permissionMapper = permissionMapper;
	}

	@Override
	public ResponseJson listPermission() {
		List<Permission> permissions = permissionMapper.listAll();
		responseJson.setStatus(true);
		responseJson.setReturnCode(ReturnCode.SUCCESS_CODE);
		responseJson.setModel(permissions);
		responseJson.setMemo("ok");
		return responseJson;
	}

}
