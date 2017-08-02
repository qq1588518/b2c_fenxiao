package pers.xym.fx.domain;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.good_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Integer goodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.user_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.num
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.order_number
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private String orderNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.status
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_order.deleted
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.id
     *
     * @return the value of fx_order.id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.id
     *
     * @param id the value for fx_order.id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.good_id
     *
     * @return the value of fx_order.good_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.good_id
     *
     * @param goodId the value for fx_order.good_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.user_id
     *
     * @return the value of fx_order.user_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.user_id
     *
     * @param userId the value for fx_order.user_id
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.num
     *
     * @return the value of fx_order.num
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.num
     *
     * @param num the value for fx_order.num
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.order_number
     *
     * @return the value of fx_order.order_number
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.order_number
     *
     * @param orderNumber the value for fx_order.order_number
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.status
     *
     * @return the value of fx_order.status
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.status
     *
     * @param status the value for fx_order.status
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_order.deleted
     *
     * @return the value of fx_order.deleted
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_order.deleted
     *
     * @param deleted the value for fx_order.deleted
     *
     * @mbg.generated Wed Aug 02 15:20:08 GMT+08:00 2017
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}