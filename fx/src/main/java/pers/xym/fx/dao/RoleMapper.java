package pers.xym.fx.dao;

import pers.xym.fx.domain.Role;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_role
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int updateByPrimaryKey(Role record);
}