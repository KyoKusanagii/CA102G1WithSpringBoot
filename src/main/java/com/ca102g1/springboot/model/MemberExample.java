package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMemNoIsNull() {
            addCriterion("MEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andMemNoIsNotNull() {
            addCriterion("MEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMemNoEqualTo(String value) {
            addCriterion("MEM_NO =", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoNotEqualTo(String value) {
            addCriterion("MEM_NO <>", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoGreaterThan(String value) {
            addCriterion("MEM_NO >", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_NO >=", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoLessThan(String value) {
            addCriterion("MEM_NO <", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoLessThanOrEqualTo(String value) {
            addCriterion("MEM_NO <=", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoLike(String value) {
            addCriterion("MEM_NO like", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoNotLike(String value) {
            addCriterion("MEM_NO not like", value, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoIn(List<String> values) {
            addCriterion("MEM_NO in", values, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoNotIn(List<String> values) {
            addCriterion("MEM_NO not in", values, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoBetween(String value1, String value2) {
            addCriterion("MEM_NO between", value1, value2, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemNoNotBetween(String value1, String value2) {
            addCriterion("MEM_NO not between", value1, value2, "memNo");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNull() {
            addCriterion("MEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("MEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(String value) {
            addCriterion("MEM_ID =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(String value) {
            addCriterion("MEM_ID <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(String value) {
            addCriterion("MEM_ID >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_ID >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(String value) {
            addCriterion("MEM_ID <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(String value) {
            addCriterion("MEM_ID <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLike(String value) {
            addCriterion("MEM_ID like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotLike(String value) {
            addCriterion("MEM_ID not like", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<String> values) {
            addCriterion("MEM_ID in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<String> values) {
            addCriterion("MEM_ID not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(String value1, String value2) {
            addCriterion("MEM_ID between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(String value1, String value2) {
            addCriterion("MEM_ID not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemPswIsNull() {
            addCriterion("MEM_PSW is null");
            return (Criteria) this;
        }

        public Criteria andMemPswIsNotNull() {
            addCriterion("MEM_PSW is not null");
            return (Criteria) this;
        }

        public Criteria andMemPswEqualTo(String value) {
            addCriterion("MEM_PSW =", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswNotEqualTo(String value) {
            addCriterion("MEM_PSW <>", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswGreaterThan(String value) {
            addCriterion("MEM_PSW >", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_PSW >=", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswLessThan(String value) {
            addCriterion("MEM_PSW <", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswLessThanOrEqualTo(String value) {
            addCriterion("MEM_PSW <=", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswLike(String value) {
            addCriterion("MEM_PSW like", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswNotLike(String value) {
            addCriterion("MEM_PSW not like", value, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswIn(List<String> values) {
            addCriterion("MEM_PSW in", values, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswNotIn(List<String> values) {
            addCriterion("MEM_PSW not in", values, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswBetween(String value1, String value2) {
            addCriterion("MEM_PSW between", value1, value2, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemPswNotBetween(String value1, String value2) {
            addCriterion("MEM_PSW not between", value1, value2, "memPsw");
            return (Criteria) this;
        }

        public Criteria andMemEmailIsNull() {
            addCriterion("MEM_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemEmailIsNotNull() {
            addCriterion("MEM_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemEmailEqualTo(String value) {
            addCriterion("MEM_EMAIL =", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotEqualTo(String value) {
            addCriterion("MEM_EMAIL <>", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailGreaterThan(String value) {
            addCriterion("MEM_EMAIL >", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_EMAIL >=", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLessThan(String value) {
            addCriterion("MEM_EMAIL <", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLessThanOrEqualTo(String value) {
            addCriterion("MEM_EMAIL <=", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailLike(String value) {
            addCriterion("MEM_EMAIL like", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotLike(String value) {
            addCriterion("MEM_EMAIL not like", value, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailIn(List<String> values) {
            addCriterion("MEM_EMAIL in", values, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotIn(List<String> values) {
            addCriterion("MEM_EMAIL not in", values, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailBetween(String value1, String value2) {
            addCriterion("MEM_EMAIL between", value1, value2, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemEmailNotBetween(String value1, String value2) {
            addCriterion("MEM_EMAIL not between", value1, value2, "memEmail");
            return (Criteria) this;
        }

        public Criteria andMemFbidIsNull() {
            addCriterion("MEM_FBID is null");
            return (Criteria) this;
        }

        public Criteria andMemFbidIsNotNull() {
            addCriterion("MEM_FBID is not null");
            return (Criteria) this;
        }

        public Criteria andMemFbidEqualTo(String value) {
            addCriterion("MEM_FBID =", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidNotEqualTo(String value) {
            addCriterion("MEM_FBID <>", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidGreaterThan(String value) {
            addCriterion("MEM_FBID >", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_FBID >=", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidLessThan(String value) {
            addCriterion("MEM_FBID <", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidLessThanOrEqualTo(String value) {
            addCriterion("MEM_FBID <=", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidLike(String value) {
            addCriterion("MEM_FBID like", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidNotLike(String value) {
            addCriterion("MEM_FBID not like", value, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidIn(List<String> values) {
            addCriterion("MEM_FBID in", values, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidNotIn(List<String> values) {
            addCriterion("MEM_FBID not in", values, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidBetween(String value1, String value2) {
            addCriterion("MEM_FBID between", value1, value2, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemFbidNotBetween(String value1, String value2) {
            addCriterion("MEM_FBID not between", value1, value2, "memFbid");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNull() {
            addCriterion("MEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("MEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("MEM_NAME =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("MEM_NAME <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("MEM_NAME >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_NAME >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("MEM_NAME <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("MEM_NAME <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("MEM_NAME like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("MEM_NAME not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("MEM_NAME in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("MEM_NAME not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("MEM_NAME between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("MEM_NAME not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemSexIsNull() {
            addCriterion("MEM_SEX is null");
            return (Criteria) this;
        }

        public Criteria andMemSexIsNotNull() {
            addCriterion("MEM_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andMemSexEqualTo(String value) {
            addCriterion("MEM_SEX =", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotEqualTo(String value) {
            addCriterion("MEM_SEX <>", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexGreaterThan(String value) {
            addCriterion("MEM_SEX >", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_SEX >=", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLessThan(String value) {
            addCriterion("MEM_SEX <", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLessThanOrEqualTo(String value) {
            addCriterion("MEM_SEX <=", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexLike(String value) {
            addCriterion("MEM_SEX like", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotLike(String value) {
            addCriterion("MEM_SEX not like", value, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexIn(List<String> values) {
            addCriterion("MEM_SEX in", values, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotIn(List<String> values) {
            addCriterion("MEM_SEX not in", values, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexBetween(String value1, String value2) {
            addCriterion("MEM_SEX between", value1, value2, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemSexNotBetween(String value1, String value2) {
            addCriterion("MEM_SEX not between", value1, value2, "memSex");
            return (Criteria) this;
        }

        public Criteria andMemBirthIsNull() {
            addCriterion("MEM_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andMemBirthIsNotNull() {
            addCriterion("MEM_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andMemBirthEqualTo(Date value) {
            addCriterion("MEM_BIRTH =", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthNotEqualTo(Date value) {
            addCriterion("MEM_BIRTH <>", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthGreaterThan(Date value) {
            addCriterion("MEM_BIRTH >", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("MEM_BIRTH >=", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthLessThan(Date value) {
            addCriterion("MEM_BIRTH <", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthLessThanOrEqualTo(Date value) {
            addCriterion("MEM_BIRTH <=", value, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthIn(List<Date> values) {
            addCriterion("MEM_BIRTH in", values, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthNotIn(List<Date> values) {
            addCriterion("MEM_BIRTH not in", values, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthBetween(Date value1, Date value2) {
            addCriterion("MEM_BIRTH between", value1, value2, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemBirthNotBetween(Date value1, Date value2) {
            addCriterion("MEM_BIRTH not between", value1, value2, "memBirth");
            return (Criteria) this;
        }

        public Criteria andMemMobileIsNull() {
            addCriterion("MEM_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMemMobileIsNotNull() {
            addCriterion("MEM_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMemMobileEqualTo(String value) {
            addCriterion("MEM_MOBILE =", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileNotEqualTo(String value) {
            addCriterion("MEM_MOBILE <>", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileGreaterThan(String value) {
            addCriterion("MEM_MOBILE >", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_MOBILE >=", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileLessThan(String value) {
            addCriterion("MEM_MOBILE <", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileLessThanOrEqualTo(String value) {
            addCriterion("MEM_MOBILE <=", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileLike(String value) {
            addCriterion("MEM_MOBILE like", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileNotLike(String value) {
            addCriterion("MEM_MOBILE not like", value, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileIn(List<String> values) {
            addCriterion("MEM_MOBILE in", values, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileNotIn(List<String> values) {
            addCriterion("MEM_MOBILE not in", values, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileBetween(String value1, String value2) {
            addCriterion("MEM_MOBILE between", value1, value2, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemMobileNotBetween(String value1, String value2) {
            addCriterion("MEM_MOBILE not between", value1, value2, "memMobile");
            return (Criteria) this;
        }

        public Criteria andMemPostIsNull() {
            addCriterion("MEM_POST is null");
            return (Criteria) this;
        }

        public Criteria andMemPostIsNotNull() {
            addCriterion("MEM_POST is not null");
            return (Criteria) this;
        }

        public Criteria andMemPostEqualTo(String value) {
            addCriterion("MEM_POST =", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostNotEqualTo(String value) {
            addCriterion("MEM_POST <>", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostGreaterThan(String value) {
            addCriterion("MEM_POST >", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_POST >=", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostLessThan(String value) {
            addCriterion("MEM_POST <", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostLessThanOrEqualTo(String value) {
            addCriterion("MEM_POST <=", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostLike(String value) {
            addCriterion("MEM_POST like", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostNotLike(String value) {
            addCriterion("MEM_POST not like", value, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostIn(List<String> values) {
            addCriterion("MEM_POST in", values, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostNotIn(List<String> values) {
            addCriterion("MEM_POST not in", values, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostBetween(String value1, String value2) {
            addCriterion("MEM_POST between", value1, value2, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemPostNotBetween(String value1, String value2) {
            addCriterion("MEM_POST not between", value1, value2, "memPost");
            return (Criteria) this;
        }

        public Criteria andMemAddressIsNull() {
            addCriterion("MEM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMemAddressIsNotNull() {
            addCriterion("MEM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMemAddressEqualTo(String value) {
            addCriterion("MEM_ADDRESS =", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotEqualTo(String value) {
            addCriterion("MEM_ADDRESS <>", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressGreaterThan(String value) {
            addCriterion("MEM_ADDRESS >", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_ADDRESS >=", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLessThan(String value) {
            addCriterion("MEM_ADDRESS <", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLessThanOrEqualTo(String value) {
            addCriterion("MEM_ADDRESS <=", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressLike(String value) {
            addCriterion("MEM_ADDRESS like", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotLike(String value) {
            addCriterion("MEM_ADDRESS not like", value, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressIn(List<String> values) {
            addCriterion("MEM_ADDRESS in", values, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotIn(List<String> values) {
            addCriterion("MEM_ADDRESS not in", values, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressBetween(String value1, String value2) {
            addCriterion("MEM_ADDRESS between", value1, value2, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemAddressNotBetween(String value1, String value2) {
            addCriterion("MEM_ADDRESS not between", value1, value2, "memAddress");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddIsNull() {
            addCriterion("MEM_RECEIVEADD is null");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddIsNotNull() {
            addCriterion("MEM_RECEIVEADD is not null");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddEqualTo(String value) {
            addCriterion("MEM_RECEIVEADD =", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddNotEqualTo(String value) {
            addCriterion("MEM_RECEIVEADD <>", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddGreaterThan(String value) {
            addCriterion("MEM_RECEIVEADD >", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_RECEIVEADD >=", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddLessThan(String value) {
            addCriterion("MEM_RECEIVEADD <", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddLessThanOrEqualTo(String value) {
            addCriterion("MEM_RECEIVEADD <=", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddLike(String value) {
            addCriterion("MEM_RECEIVEADD like", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddNotLike(String value) {
            addCriterion("MEM_RECEIVEADD not like", value, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddIn(List<String> values) {
            addCriterion("MEM_RECEIVEADD in", values, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddNotIn(List<String> values) {
            addCriterion("MEM_RECEIVEADD not in", values, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddBetween(String value1, String value2) {
            addCriterion("MEM_RECEIVEADD between", value1, value2, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemReceiveaddNotBetween(String value1, String value2) {
            addCriterion("MEM_RECEIVEADD not between", value1, value2, "memReceiveadd");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeIsNull() {
            addCriterion("MEM_ACTIVECODE is null");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeIsNotNull() {
            addCriterion("MEM_ACTIVECODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeEqualTo(String value) {
            addCriterion("MEM_ACTIVECODE =", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeNotEqualTo(String value) {
            addCriterion("MEM_ACTIVECODE <>", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeGreaterThan(String value) {
            addCriterion("MEM_ACTIVECODE >", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_ACTIVECODE >=", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeLessThan(String value) {
            addCriterion("MEM_ACTIVECODE <", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeLessThanOrEqualTo(String value) {
            addCriterion("MEM_ACTIVECODE <=", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeLike(String value) {
            addCriterion("MEM_ACTIVECODE like", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeNotLike(String value) {
            addCriterion("MEM_ACTIVECODE not like", value, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeIn(List<String> values) {
            addCriterion("MEM_ACTIVECODE in", values, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeNotIn(List<String> values) {
            addCriterion("MEM_ACTIVECODE not in", values, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeBetween(String value1, String value2) {
            addCriterion("MEM_ACTIVECODE between", value1, value2, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemActivecodeNotBetween(String value1, String value2) {
            addCriterion("MEM_ACTIVECODE not between", value1, value2, "memActivecode");
            return (Criteria) this;
        }

        public Criteria andMemConditionIsNull() {
            addCriterion("MEM_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andMemConditionIsNotNull() {
            addCriterion("MEM_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andMemConditionEqualTo(Short value) {
            addCriterion("MEM_CONDITION =", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionNotEqualTo(Short value) {
            addCriterion("MEM_CONDITION <>", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionGreaterThan(Short value) {
            addCriterion("MEM_CONDITION >", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionGreaterThanOrEqualTo(Short value) {
            addCriterion("MEM_CONDITION >=", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionLessThan(Short value) {
            addCriterion("MEM_CONDITION <", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionLessThanOrEqualTo(Short value) {
            addCriterion("MEM_CONDITION <=", value, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionIn(List<Short> values) {
            addCriterion("MEM_CONDITION in", values, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionNotIn(List<Short> values) {
            addCriterion("MEM_CONDITION not in", values, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionBetween(Short value1, Short value2) {
            addCriterion("MEM_CONDITION between", value1, value2, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemConditionNotBetween(Short value1, Short value2) {
            addCriterion("MEM_CONDITION not between", value1, value2, "memCondition");
            return (Criteria) this;
        }

        public Criteria andMemArtauthIsNull() {
            addCriterion("MEM_ARTAUTH is null");
            return (Criteria) this;
        }

        public Criteria andMemArtauthIsNotNull() {
            addCriterion("MEM_ARTAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andMemArtauthEqualTo(Short value) {
            addCriterion("MEM_ARTAUTH =", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthNotEqualTo(Short value) {
            addCriterion("MEM_ARTAUTH <>", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthGreaterThan(Short value) {
            addCriterion("MEM_ARTAUTH >", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthGreaterThanOrEqualTo(Short value) {
            addCriterion("MEM_ARTAUTH >=", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthLessThan(Short value) {
            addCriterion("MEM_ARTAUTH <", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthLessThanOrEqualTo(Short value) {
            addCriterion("MEM_ARTAUTH <=", value, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthIn(List<Short> values) {
            addCriterion("MEM_ARTAUTH in", values, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthNotIn(List<Short> values) {
            addCriterion("MEM_ARTAUTH not in", values, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthBetween(Short value1, Short value2) {
            addCriterion("MEM_ARTAUTH between", value1, value2, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemArtauthNotBetween(Short value1, Short value2) {
            addCriterion("MEM_ARTAUTH not between", value1, value2, "memArtauth");
            return (Criteria) this;
        }

        public Criteria andMemMartnameIsNull() {
            addCriterion("MEM_MARTNAME is null");
            return (Criteria) this;
        }

        public Criteria andMemMartnameIsNotNull() {
            addCriterion("MEM_MARTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemMartnameEqualTo(String value) {
            addCriterion("MEM_MARTNAME =", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameNotEqualTo(String value) {
            addCriterion("MEM_MARTNAME <>", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameGreaterThan(String value) {
            addCriterion("MEM_MARTNAME >", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_MARTNAME >=", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameLessThan(String value) {
            addCriterion("MEM_MARTNAME <", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameLessThanOrEqualTo(String value) {
            addCriterion("MEM_MARTNAME <=", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameLike(String value) {
            addCriterion("MEM_MARTNAME like", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameNotLike(String value) {
            addCriterion("MEM_MARTNAME not like", value, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameIn(List<String> values) {
            addCriterion("MEM_MARTNAME in", values, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameNotIn(List<String> values) {
            addCriterion("MEM_MARTNAME not in", values, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameBetween(String value1, String value2) {
            addCriterion("MEM_MARTNAME between", value1, value2, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartnameNotBetween(String value1, String value2) {
            addCriterion("MEM_MARTNAME not between", value1, value2, "memMartname");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoIsNull() {
            addCriterion("MEM_MARTINFO is null");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoIsNotNull() {
            addCriterion("MEM_MARTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoEqualTo(String value) {
            addCriterion("MEM_MARTINFO =", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoNotEqualTo(String value) {
            addCriterion("MEM_MARTINFO <>", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoGreaterThan(String value) {
            addCriterion("MEM_MARTINFO >", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_MARTINFO >=", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoLessThan(String value) {
            addCriterion("MEM_MARTINFO <", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoLessThanOrEqualTo(String value) {
            addCriterion("MEM_MARTINFO <=", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoLike(String value) {
            addCriterion("MEM_MARTINFO like", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoNotLike(String value) {
            addCriterion("MEM_MARTINFO not like", value, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoIn(List<String> values) {
            addCriterion("MEM_MARTINFO in", values, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoNotIn(List<String> values) {
            addCriterion("MEM_MARTINFO not in", values, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoBetween(String value1, String value2) {
            addCriterion("MEM_MARTINFO between", value1, value2, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemMartinfoNotBetween(String value1, String value2) {
            addCriterion("MEM_MARTINFO not between", value1, value2, "memMartinfo");
            return (Criteria) this;
        }

        public Criteria andMemRecommendIsNull() {
            addCriterion("MEM_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andMemRecommendIsNotNull() {
            addCriterion("MEM_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andMemRecommendEqualTo(String value) {
            addCriterion("MEM_RECOMMEND =", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendNotEqualTo(String value) {
            addCriterion("MEM_RECOMMEND <>", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendGreaterThan(String value) {
            addCriterion("MEM_RECOMMEND >", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("MEM_RECOMMEND >=", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendLessThan(String value) {
            addCriterion("MEM_RECOMMEND <", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendLessThanOrEqualTo(String value) {
            addCriterion("MEM_RECOMMEND <=", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendLike(String value) {
            addCriterion("MEM_RECOMMEND like", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendNotLike(String value) {
            addCriterion("MEM_RECOMMEND not like", value, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendIn(List<String> values) {
            addCriterion("MEM_RECOMMEND in", values, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendNotIn(List<String> values) {
            addCriterion("MEM_RECOMMEND not in", values, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendBetween(String value1, String value2) {
            addCriterion("MEM_RECOMMEND between", value1, value2, "memRecommend");
            return (Criteria) this;
        }

        public Criteria andMemRecommendNotBetween(String value1, String value2) {
            addCriterion("MEM_RECOMMEND not between", value1, value2, "memRecommend");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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