package pers.xym.fx.domain;

public class Administrator {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_administrator.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_administrator.username
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_administrator.password
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_administrator.salt
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fx_administrator.nickname
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    private String nickname;
    
    /**
     * 用户是否被封禁
     */
    private boolean ban;
    
    public Administrator() {
	}

    public Administrator(String username) {
		super();
		this.username = username;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_administrator.id
     *
     * @return the value of fx_administrator.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_administrator.id
     *
     * @param id the value for fx_administrator.id
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_administrator.username
     *
     * @return the value of fx_administrator.username
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_administrator.username
     *
     * @param username the value for fx_administrator.username
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_administrator.password
     *
     * @return the value of fx_administrator.password
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_administrator.password
     *
     * @param password the value for fx_administrator.password
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_administrator.salt
     *
     * @return the value of fx_administrator.salt
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_administrator.salt
     *
     * @param salt the value for fx_administrator.salt
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fx_administrator.nickname
     *
     * @return the value of fx_administrator.nickname
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fx_administrator.nickname
     *
     * @param nickname the value for fx_administrator.nickname
     *
     * @mbg.generated Mon Aug 07 14:00:53 GMT+08:00 2017
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

	public boolean getBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}
}