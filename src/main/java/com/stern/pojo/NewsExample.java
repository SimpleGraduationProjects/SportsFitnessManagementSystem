package com.stern.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public NewsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNull() {
            addCriterion("ntitle is null");
            return (Criteria) this;
        }

        public Criteria andNtitleIsNotNull() {
            addCriterion("ntitle is not null");
            return (Criteria) this;
        }

        public Criteria andNtitleEqualTo(String value) {
            addCriterion("ntitle =", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotEqualTo(String value) {
            addCriterion("ntitle <>", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThan(String value) {
            addCriterion("ntitle >", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ntitle >=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThan(String value) {
            addCriterion("ntitle <", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLessThanOrEqualTo(String value) {
            addCriterion("ntitle <=", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleLike(String value) {
            addCriterion("ntitle like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotLike(String value) {
            addCriterion("ntitle not like", value, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleIn(List<String> values) {
            addCriterion("ntitle in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotIn(List<String> values) {
            addCriterion("ntitle not in", values, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleBetween(String value1, String value2) {
            addCriterion("ntitle between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNtitleNotBetween(String value1, String value2) {
            addCriterion("ntitle not between", value1, value2, "ntitle");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeIsNull() {
            addCriterion("ncreatetime is null");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeIsNotNull() {
            addCriterion("ncreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeEqualTo(Date value) {
            addCriterion("ncreatetime =", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeNotEqualTo(Date value) {
            addCriterion("ncreatetime <>", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeGreaterThan(Date value) {
            addCriterion("ncreatetime >", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ncreatetime >=", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeLessThan(Date value) {
            addCriterion("ncreatetime <", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ncreatetime <=", value, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeIn(List<Date> values) {
            addCriterion("ncreatetime in", values, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeNotIn(List<Date> values) {
            addCriterion("ncreatetime not in", values, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ncreatetime between", value1, value2, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ncreatetime not between", value1, value2, "ncreatetime");
            return (Criteria) this;
        }

        public Criteria andNkIdIsNull() {
            addCriterion("nk_id is null");
            return (Criteria) this;
        }

        public Criteria andNkIdIsNotNull() {
            addCriterion("nk_id is not null");
            return (Criteria) this;
        }

        public Criteria andNkIdEqualTo(Integer value) {
            addCriterion("nk_id =", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdNotEqualTo(Integer value) {
            addCriterion("nk_id <>", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdGreaterThan(Integer value) {
            addCriterion("nk_id >", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nk_id >=", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdLessThan(Integer value) {
            addCriterion("nk_id <", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdLessThanOrEqualTo(Integer value) {
            addCriterion("nk_id <=", value, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdIn(List<Integer> values) {
            addCriterion("nk_id in", values, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdNotIn(List<Integer> values) {
            addCriterion("nk_id not in", values, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdBetween(Integer value1, Integer value2) {
            addCriterion("nk_id between", value1, value2, "nkId");
            return (Criteria) this;
        }

        public Criteria andNkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nk_id not between", value1, value2, "nkId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}