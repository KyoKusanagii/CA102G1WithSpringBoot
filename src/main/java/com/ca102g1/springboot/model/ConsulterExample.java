package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class ConsulterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsulterExample() {
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

        public Criteria andConsulterNoIsNull() {
            addCriterion("CONSULTER_NO is null");
            return (Criteria) this;
        }

        public Criteria andConsulterNoIsNotNull() {
            addCriterion("CONSULTER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andConsulterNoEqualTo(String value) {
            addCriterion("CONSULTER_NO =", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoNotEqualTo(String value) {
            addCriterion("CONSULTER_NO <>", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoGreaterThan(String value) {
            addCriterion("CONSULTER_NO >", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTER_NO >=", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoLessThan(String value) {
            addCriterion("CONSULTER_NO <", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoLessThanOrEqualTo(String value) {
            addCriterion("CONSULTER_NO <=", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoLike(String value) {
            addCriterion("CONSULTER_NO like", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoNotLike(String value) {
            addCriterion("CONSULTER_NO not like", value, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoIn(List<String> values) {
            addCriterion("CONSULTER_NO in", values, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoNotIn(List<String> values) {
            addCriterion("CONSULTER_NO not in", values, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoBetween(String value1, String value2) {
            addCriterion("CONSULTER_NO between", value1, value2, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNoNotBetween(String value1, String value2) {
            addCriterion("CONSULTER_NO not between", value1, value2, "consulterNo");
            return (Criteria) this;
        }

        public Criteria andConsulterNameIsNull() {
            addCriterion("CONSULTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConsulterNameIsNotNull() {
            addCriterion("CONSULTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConsulterNameEqualTo(String value) {
            addCriterion("CONSULTER_NAME =", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameNotEqualTo(String value) {
            addCriterion("CONSULTER_NAME <>", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameGreaterThan(String value) {
            addCriterion("CONSULTER_NAME >", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTER_NAME >=", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameLessThan(String value) {
            addCriterion("CONSULTER_NAME <", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameLessThanOrEqualTo(String value) {
            addCriterion("CONSULTER_NAME <=", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameLike(String value) {
            addCriterion("CONSULTER_NAME like", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameNotLike(String value) {
            addCriterion("CONSULTER_NAME not like", value, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameIn(List<String> values) {
            addCriterion("CONSULTER_NAME in", values, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameNotIn(List<String> values) {
            addCriterion("CONSULTER_NAME not in", values, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameBetween(String value1, String value2) {
            addCriterion("CONSULTER_NAME between", value1, value2, "consulterName");
            return (Criteria) this;
        }

        public Criteria andConsulterNameNotBetween(String value1, String value2) {
            addCriterion("CONSULTER_NAME not between", value1, value2, "consulterName");
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