package pers.xym.fx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.xym.fx.dao.AdministratorMapper;
import pers.xym.fx.domain.Administrator;
import pers.xym.fx.service.AdministratorService;
import pers.xym.fx.util.Page;

@Service
public class AdministratorServiceImpl implements AdministratorService {
	private Page<Administrator> page;
	private AdministratorMapper administratorMapper;

	public Page<Administrator> getPage() {
		return page;
	}

	@Autowired
	public void setPage(Page<Administrator> page) {
		this.page = page;
	}

	public AdministratorMapper getAdministratorMapper() {
		return administratorMapper;
	}

	@Autowired
	public void setAdministratorMapper(AdministratorMapper administratorMapper) {
		this.administratorMapper = administratorMapper;
	}

	@Override
	public Page<Administrator> listAdministrator(int page, int pageSize) {
		return null;
	}

	@Override
	public Page<Administrator> listAdministrator(Map<String, String> condiition, int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdministrator(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Administrator getAdministrator(Map<String, String> condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRoles(Administrator administrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPermissions(Administrator administrator) {
		// TODO Auto-generated method stub
		return null;
	}

}
