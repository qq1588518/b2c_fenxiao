package pers.xym.fx.domain;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_permission.id
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_permission.name
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_permission.id
     *
     * @return the value of fx_permission.id
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_permission.id
     *
     * @param id the value for fx_permission.id
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_permission.name
     *
     * @return the value of fx_permission.name
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_permission.name
     *
     * @param name the value for fx_permission.name
     *
     * @mbg.generated Mon Aug 07 14:34:38 GMT+08:00 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}