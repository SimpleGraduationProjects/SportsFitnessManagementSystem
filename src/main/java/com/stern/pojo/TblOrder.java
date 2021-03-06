package com.stern.pojo;

import java.util.Date;

public class TblOrder {
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order.oid
     *
     * @mbg.generated
     */
    private Integer oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order.member_id
     *
     * @mbg.generated
     */
    private Integer memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order.ocreatetime
     *
     * @mbg.generated
     */
    private Date ocreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order.class_id
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_order.ostatus
     *
     * @mbg.generated
     */
    private Integer ostatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order.oid
     *
     * @return the value of tbl_order.oid
     *
     * @mbg.generated
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order.oid
     *
     * @param oid the value for tbl_order.oid
     *
     * @mbg.generated
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order.member_id
     *
     * @return the value of tbl_order.member_id
     *
     * @mbg.generated
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order.member_id
     *
     * @param memberId the value for tbl_order.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order.ocreatetime
     *
     * @return the value of tbl_order.ocreatetime
     *
     * @mbg.generated
     */
    public Date getOcreatetime() {
        return ocreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order.ocreatetime
     *
     * @param ocreatetime the value for tbl_order.ocreatetime
     *
     * @mbg.generated
     */
    public void setOcreatetime(Date ocreatetime) {
        this.ocreatetime = ocreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order.class_id
     *
     * @return the value of tbl_order.class_id
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order.class_id
     *
     * @param classId the value for tbl_order.class_id
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_order.ostatus
     *
     * @return the value of tbl_order.ostatus
     *
     * @mbg.generated
     */
    public Integer getOstatus() {
        return ostatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_order.ostatus
     *
     * @param ostatus the value for tbl_order.ostatus
     *
     * @mbg.generated
     */
    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }
}