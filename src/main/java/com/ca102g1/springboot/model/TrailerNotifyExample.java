package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class TrailerNotifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrailerNotifyExample() {
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

        public Criteria andTrailerNoIsNull() {
            addCriterion("TRAILER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrailerNoIsNotNull() {
            addCriterion("TRAILER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrailerNoEqualTo(String value) {
            addCriterion("TRAILER_NO =", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoNotEqualTo(String value) {
            addCriterion("TRAILER_NO <>", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoGreaterThan(String value) {
            addCriterion("TRAILER_NO >", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRAILER_NO >=", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoLessThan(String value) {
            addCriterion("TRAILER_NO <", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoLessThanOrEqualTo(String value) {
            addCriterion("TRAILER_NO <=", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoLike(String value) {
            addCriterion("TRAILER_NO like", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoNotLike(String value) {
            addCriterion("TRAILER_NO not like", value, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoIn(List<String> values) {
            addCriterion("TRAILER_NO in", values, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoNotIn(List<String> values) {
            addCriterion("TRAILER_NO not in", values, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoBetween(String value1, String value2) {
            addCriterion("TRAILER_NO between", value1, value2, "trailerNo");
            return (Criteria) this;
        }

        public Criteria andTrailerNoNotBetween(String value1, String value2) {
            addCriterion("TRAILER_NO not between", value1, value2, "trailerNo");
            return (Criteria) this;
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