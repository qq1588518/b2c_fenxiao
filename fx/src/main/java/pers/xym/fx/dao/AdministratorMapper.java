package pers.xym.fx.dao;

import pers.xym.fx.domain.Administrator;

public interface AdministratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int insert(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int insertSelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    Administrator selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_administrator
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    int updateByPrimaryKey(Administrator record);
}