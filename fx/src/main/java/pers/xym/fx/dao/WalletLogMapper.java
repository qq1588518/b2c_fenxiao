package pers.xym.fx.dao;

import pers.xym.fx.domain.WalletLog;

public interface WalletLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int insert(WalletLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int insertSelective(WalletLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    WalletLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(WalletLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int updateByPrimaryKeyWithBLOBs(WalletLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fx_walletlog
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    int updateByPrimaryKey(WalletLog record);
}