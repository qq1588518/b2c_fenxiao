package pers.xym.fx.dao;

import pers.xym.fx.domain.AdministratorRoleKey;

public interface AdministratorRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fx_administrator_role
	 * @mbg.generated  Wed Aug 09 11:45:24 GMT+08:00 2017
	 */
	int deleteByPrimaryKey(AdministratorRoleKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fx_administrator_role
	 * @mbg.generated  Wed Aug 09 11:45:24 GMT+08:00 2017
	 */
	int insert(AdministratorRoleKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fx_administrator_role
	 * @mbg.generated  Wed Aug 09 11:45:24 GMT+08:00 2017
	 */
	int insertSelective(AdministratorRoleKey record);
}