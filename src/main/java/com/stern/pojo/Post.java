package com.stern.pojo;

import java.math.BigDecimal;

/**
 * 职位 -实体类
 */
public class Post {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.pname
     *
     * @mbg.generated
     */
    private String pname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.psalary
     *
     * @mbg.generated
     */
    private BigDecimal psalary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.pid
     *
     * @return the value of post.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.pid
     *
     * @param pid the value for post.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.pname
     *
     * @return the value of post.pname
     *
     * @mbg.generated
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.pname
     *
     * @param pname the value for post.pname
     *
     * @mbg.generated
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.psalary
     *
     * @return the value of post.psalary
     *
     * @mbg.generated
     */
    public BigDecimal getPsalary() {
        return psalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.psalary
     *
     * @param psalary the value for post.psalary
     *
     * @mbg.generated
     */
    public void setPsalary(BigDecimal psalary) {
        this.psalary = psalary;
    }
}