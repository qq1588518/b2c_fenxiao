package pers.xym.fx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.xym.fx.dao.PermissionMapper;
import pers.xym.fx.domain.Permission;
import pers.xym.fx.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {
	private PermissionMapper permissonMaper;

	public PermissionMapper getPermissonMaper() {
		return permissonMaper;
	}

	@Autowired
	public void setPermissonMaper(PermissionMapper permissonMaper) {
		this.permissonMaper = permissonMaper;
	}

	@Override
	public List<Permission> listPermission() {
		return permissonMaper.listAll();
	}

}
