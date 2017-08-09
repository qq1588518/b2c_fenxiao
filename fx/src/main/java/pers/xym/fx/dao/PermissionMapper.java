package pers.xym.fx.dao;

import java.util.List;

import pers.xym.fx.domain.Permission;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_permission
     *
     * @mbg.generated Wed Aug 09 11:45:24 GMT+08:00 2017
     */
    int updateByPrimaryKey(Permission record);
    
    /**
     * 获取权限列表
     * @return
     */
    List<Permission> listAll();
}