package pers.xym.fx.dao;

import pers.xym.fx.domain.Order;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_order
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int updateByPrimaryKey(Order record);
}