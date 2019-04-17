package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpNoIsNull() {
            addCriterion("EMP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("EMP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("EMP_NO =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("EMP_NO <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("EMP_NO >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NO >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("EMP_NO <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("EMP_NO <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("EMP_NO like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("EMP_NO not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("EMP_NO in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("EMP_NO not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("EMP_NO between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("EMP_NO not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("EMP_ID like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("EMP_ID not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIsNull() {
            addCriterion("EMP_PWD is null");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIsNotNull() {
            addCriterion("EMP_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPwdEqualTo(String value) {
            addCriterion("EMP_PWD =", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotEqualTo(String value) {
            addCriterion("EMP_PWD <>", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdGreaterThan(String value) {
            addCriterion("EMP_PWD >", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PWD >=", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLessThan(String value) {
            addCriterion("EMP_PWD <", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLessThanOrEqualTo(String value) {
            addCriterion("EMP_PWD <=", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLike(String value) {
            addCriterion("EMP_PWD like", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotLike(String value) {
            addCriterion("EMP_PWD not like", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIn(List<String> values) {
            addCriterion("EMP_PWD in", values, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotIn(List<String> values) {
            addCriterion("EMP_PWD not in", values, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdBetween(String value1, String value2) {
            addCriterion("EMP_PWD between", value1, value2, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotBetween(String value1, String value2) {
            addCriterion("EMP_PWD not between", value1, value2, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("EMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("EMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("EMP_NAME =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("EMP_NAME <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("EMP_NAME >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NAME >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("EMP_NAME <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("EMP_NAME <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("EMP_NAME like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("EMP_NAME not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("EMP_NAME in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("EMP_NAME not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("EMP_NAME between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("EMP_NAME not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("EMP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("EMP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(Short value) {
            addCriterion("EMP_STATUS =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(Short value) {
            addCriterion("EMP_STATUS <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(Short value) {
            addCriterion("EMP_STATUS >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_STATUS >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(Short value) {
            addCriterion("EMP_STATUS <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(Short value) {
            addCriterion("EMP_STATUS <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<Short> values) {
            addCriterion("EMP_STATUS in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<Short> values) {
            addCriterion("EMP_STATUS not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(Short value1, Short value2) {
            addCriterion("EMP_STATUS between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(Short value1, Short value2) {
            addCriterion("EMP_STATUS not between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthIsNull() {
            addCriterion("EMP_MEM_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthIsNotNull() {
            addCriterion("EMP_MEM_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthEqualTo(Short value) {
            addCriterion("EMP_MEM_AUTH =", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthNotEqualTo(Short value) {
            addCriterion("EMP_MEM_AUTH <>", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthGreaterThan(Short value) {
            addCriterion("EMP_MEM_AUTH >", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_MEM_AUTH >=", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthLessThan(Short value) {
            addCriterion("EMP_MEM_AUTH <", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthLessThanOrEqualTo(Short value) {
            addCriterion("EMP_MEM_AUTH <=", value, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthIn(List<Short> values) {
            addCriterion("EMP_MEM_AUTH in", values, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthNotIn(List<Short> values) {
            addCriterion("EMP_MEM_AUTH not in", values, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthBetween(Short value1, Short value2) {
            addCriterion("EMP_MEM_AUTH between", value1, value2, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpMemAuthNotBetween(Short value1, Short value2) {
            addCriterion("EMP_MEM_AUTH not between", value1, value2, "empMemAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthIsNull() {
            addCriterion("EMP_CAROUSEL_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthIsNotNull() {
            addCriterion("EMP_CAROUSEL_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthEqualTo(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH =", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthNotEqualTo(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH <>", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthGreaterThan(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH >", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH >=", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthLessThan(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH <", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthLessThanOrEqualTo(Short value) {
            addCriterion("EMP_CAROUSEL_AUTH <=", value, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthIn(List<Short> values) {
            addCriterion("EMP_CAROUSEL_AUTH in", values, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthNotIn(List<Short> values) {
            addCriterion("EMP_CAROUSEL_AUTH not in", values, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthBetween(Short value1, Short value2) {
            addCriterion("EMP_CAROUSEL_AUTH between", value1, value2, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpCarouselAuthNotBetween(Short value1, Short value2) {
            addCriterion("EMP_CAROUSEL_AUTH not between", value1, value2, "empCarouselAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthIsNull() {
            addCriterion("EMP_REPORT_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthIsNotNull() {
            addCriterion("EMP_REPORT_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthEqualTo(Short value) {
            addCriterion("EMP_REPORT_AUTH =", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthNotEqualTo(Short value) {
            addCriterion("EMP_REPORT_AUTH <>", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthGreaterThan(Short value) {
            addCriterion("EMP_REPORT_AUTH >", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_REPORT_AUTH >=", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthLessThan(Short value) {
            addCriterion("EMP_REPORT_AUTH <", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthLessThanOrEqualTo(Short value) {
            addCriterion("EMP_REPORT_AUTH <=", value, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthIn(List<Short> values) {
            addCriterion("EMP_REPORT_AUTH in", values, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthNotIn(List<Short> values) {
            addCriterion("EMP_REPORT_AUTH not in", values, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthBetween(Short value1, Short value2) {
            addCriterion("EMP_REPORT_AUTH between", value1, value2, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpReportAuthNotBetween(Short value1, Short value2) {
            addCriterion("EMP_REPORT_AUTH not between", value1, value2, "empReportAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthIsNull() {
            addCriterion("EMP_CHAT_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthIsNotNull() {
            addCriterion("EMP_CHAT_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthEqualTo(Short value) {
            addCriterion("EMP_CHAT_AUTH =", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthNotEqualTo(Short value) {
            addCriterion("EMP_CHAT_AUTH <>", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthGreaterThan(Short value) {
            addCriterion("EMP_CHAT_AUTH >", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_CHAT_AUTH >=", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthLessThan(Short value) {
            addCriterion("EMP_CHAT_AUTH <", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthLessThanOrEqualTo(Short value) {
            addCriterion("EMP_CHAT_AUTH <=", value, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthIn(List<Short> values) {
            addCriterion("EMP_CHAT_AUTH in", values, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthNotIn(List<Short> values) {
            addCriterion("EMP_CHAT_AUTH not in", values, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthBetween(Short value1, Short value2) {
            addCriterion("EMP_CHAT_AUTH between", value1, value2, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpChatAuthNotBetween(Short value1, Short value2) {
            addCriterion("EMP_CHAT_AUTH not between", value1, value2, "empChatAuth");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIsNull() {
            addCriterion("EMP_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIsNotNull() {
            addCriterion("EMP_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEmpLevelEqualTo(Short value) {
            addCriterion("EMP_LEVEL =", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotEqualTo(Short value) {
            addCriterion("EMP_LEVEL <>", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelGreaterThan(Short value) {
            addCriterion("EMP_LEVEL >", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_LEVEL >=", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelLessThan(Short value) {
            addCriterion("EMP_LEVEL <", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelLessThanOrEqualTo(Short value) {
            addCriterion("EMP_LEVEL <=", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIn(List<Short> values) {
            addCriterion("EMP_LEVEL in", values, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotIn(List<Short> values) {
            addCriterion("EMP_LEVEL not in", values, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelBetween(Short value1, Short value2) {
            addCriterion("EMP_LEVEL between", value1, value2, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotBetween(Short value1, Short value2) {
            addCriterion("EMP_LEVEL not between", value1, value2, "empLevel");
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