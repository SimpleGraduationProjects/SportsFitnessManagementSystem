package com.stern.pojo;

import java.util.Date;

public class Message {
    private Reply reply;
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_id
     *
     * @mbg.generated
     */
    private Integer msgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_mid
     *
     * @mbg.generated
     */
    private Integer msgMid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_content
     *
     * @mbg.generated
     */
    private String msgContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_rid
     *
     * @mbg.generated
     */
    private Integer msgRid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.msg_date
     *
     * @mbg.generated
     */
    private Date msgDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_id
     *
     * @return the value of message.msg_id
     *
     * @mbg.generated
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_id
     *
     * @param msgId the value for message.msg_id
     *
     * @mbg.generated
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_mid
     *
     * @return the value of message.msg_mid
     *
     * @mbg.generated
     */
    public Integer getMsgMid() {
        return msgMid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_mid
     *
     * @param msgMid the value for message.msg_mid
     *
     * @mbg.generated
     */
    public void setMsgMid(Integer msgMid) {
        this.msgMid = msgMid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_content
     *
     * @return the value of message.msg_content
     *
     * @mbg.generated
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_content
     *
     * @param msgContent the value for message.msg_content
     *
     * @mbg.generated
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_rid
     *
     * @return the value of message.msg_rid
     *
     * @mbg.generated
     */
    public Integer getMsgRid() {
        return msgRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_rid
     *
     * @param msgRid the value for message.msg_rid
     *
     * @mbg.generated
     */
    public void setMsgRid(Integer msgRid) {
        this.msgRid = msgRid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.msg_date
     *
     * @return the value of message.msg_date
     *
     * @mbg.generated
     */
    public Date getMsgDate() {
        return msgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.msg_date
     *
     * @param msgDate the value for message.msg_date
     *
     * @mbg.generated
     */
    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }
}