package pers.xym.fx.domain;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_role.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_role.name
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_role.id
     *
     * @return the value of fx_role.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_role.id
     *
     * @param id the value for fx_role.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_role.name
     *
     * @return the value of fx_role.name
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_role.name
     *
     * @param name the value for fx_role.name
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}