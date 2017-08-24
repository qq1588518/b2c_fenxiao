package pers.xym.fx.service.impl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.xym.fx.dao.AdministratorMapper;
import pers.xym.fx.domain.Administrator;
import pers.xym.fx.exception.UsernameExists;
import pers.xym.fx.service.AdministratorService;
import pers.xym.fx.util.Md5PasswordUtil;
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
		this.page.setPage(page);
		this.page.setPageSize(pageSize);
		this.page.setList(administratorMapper.listAdministratorByPage(this.page.getMysqlPageParam()));
		this.page.setTotalRows(administratorMapper.getTotalRows());
		this.page.countTotalPage();
		return this.page;
	}

	@Override
	public Page<Administrator> listAdministrator(Administrator administrator, int page, int pageSize) {
		this.page.setPage(page);
		this.page.setPageSize(pageSize);
		this.page.setList(
				administratorMapper.listAdministratorByPageAndCondition(administrator, this.page.getMysqlPageParam()));
		this.page.setTotalRows(administratorMapper.getTotalRows());
		this.page.countTotalPage();
		return this.page;
	}

	@Override
	public boolean addAdministrator(Administrator administrator) throws UsernameExists {
		Administrator record = administratorMapper.selectByCondition(new Administrator(administrator.getUsername()));
		if (record != null) {
			throw new UsernameExists("用户名已存在");
		}
		String salt = Md5PasswordUtil.newSalt();
		administrator.setSalt(salt);
		administrator.setPassword(Md5PasswordUtil.hashPassword(administrator.getPassword(), salt));
		if (administratorMapper.insertSelective(administrator) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateAdministrator(Administrator administrator) {
		if (administratorMapper.updateByPrimaryKeySelective(administrator) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteAdministrator(int id) {
		if (administratorMapper.deleteByPrimaryKey(id) > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Administrator findAdministrator(Administrator administrator) {
		return administratorMapper.selectByCondition(administrator);
	}

	@Override
	public Administrator getAdministrator(int id) {
		return administratorMapper.selectByPrimaryKey(id);
	}

	@Override
	public void login(String username, String password, boolean rememberMe) {
		Subject subject = SecurityUtils.getSubject();
		AuthenticationToken token = new UsernamePasswordToken(username, password, rememberMe);
		subject.login(token);
	}
}
