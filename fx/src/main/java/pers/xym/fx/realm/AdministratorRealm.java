package pers.xym.fx.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import pers.xym.fx.dao.AdministratorMapper;
import pers.xym.fx.domain.Administrator;
import pers.xym.fx.util.Md5PasswordUtil;

public class AdministratorRealm extends AuthorizingRealm {
	/**
	 * administratorDao
	 */
	private AdministratorMapper administratorMapper;

	public AdministratorMapper getAdministratorMapper() {
		return administratorMapper;
	}

	@Autowired
	public void setAdministratorMapper(AdministratorMapper administratorMapper) {
		this.administratorMapper = administratorMapper;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		Administrator record = new Administrator();
		record.setUsername(principalCollection.getPrimaryPrincipal().toString());
		Administrator administrator = administratorMapper.selectByCondition(record);
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(administratorMapper.getRoles(administrator.getId()));
		authorizationInfo.setStringPermissions(administratorMapper.getPermissions(administrator.getId()));
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		Administrator record = new Administrator();
		record.setUsername(authenticationToken.getPrincipal().toString());
		Administrator administrator = administratorMapper.selectByCondition(record);
		if (administrator == null) {
			throw new UnknownAccountException("用户不存在");
		}
		if (Boolean.TRUE.equals(administrator.getBan())) {
			throw new LockedAccountException("您的账号已被锁定");
		}
		return new SimpleAuthenticationInfo(administrator.getUsername(), administrator.getPassword(),
				ByteSource.Util.bytes(administrator.getSalt()), getName());
	}

	@Override
	public CredentialsMatcher getCredentialsMatcher() {
		HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
		hashedCredentialsMatcher.setHashAlgorithmName(Md5PasswordUtil.hashAlgorithm);
		hashedCredentialsMatcher.setHashIterations(Md5PasswordUtil.hashIterations);
		return hashedCredentialsMatcher;
	}

}
