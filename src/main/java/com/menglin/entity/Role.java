package com.menglin.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.is_delete
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.creator
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.modifier
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.gmt_create
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.gmt_modify
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    private Date gmtModify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.description
     *
     * @return the value of role.description
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.description
     *
     * @param description the value for role.description
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.is_delete
     *
     * @return the value of role.is_delete
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.is_delete
     *
     * @param isDelete the value for role.is_delete
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.creator
     *
     * @return the value of role.creator
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.creator
     *
     * @param creator the value for role.creator
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.modifier
     *
     * @return the value of role.modifier
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.modifier
     *
     * @param modifier the value for role.modifier
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.gmt_create
     *
     * @return the value of role.gmt_create
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.gmt_create
     *
     * @param gmtCreate the value for role.gmt_create
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.gmt_modify
     *
     * @return the value of role.gmt_modify
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.gmt_modify
     *
     * @param gmtModify the value for role.gmt_modify
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}