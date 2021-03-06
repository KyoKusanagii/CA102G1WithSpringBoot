package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class ParticularsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParticularsExample() {
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

        public Criteria andPartNoIsNull() {
            addCriterion("PART_NO is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("PART_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(Long value) {
            addCriterion("PART_NO =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(Long value) {
            addCriterion("PART_NO <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(Long value) {
            addCriterion("PART_NO >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(Long value) {
            addCriterion("PART_NO >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(Long value) {
            addCriterion("PART_NO <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(Long value) {
            addCriterion("PART_NO <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<Long> values) {
            addCriterion("PART_NO in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<Long> values) {
            addCriterion("PART_NO not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(Long value1, Long value2) {
            addCriterion("PART_NO between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(Long value1, Long value2) {
            addCriterion("PART_NO not between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andCatNoIsNull() {
            addCriterion("CAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCatNoIsNotNull() {
            addCriterion("CAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCatNoEqualTo(Short value) {
            addCriterion("CAT_NO =", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoNotEqualTo(Short value) {
            addCriterion("CAT_NO <>", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoGreaterThan(Short value) {
            addCriterion("CAT_NO >", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoGreaterThanOrEqualTo(Short value) {
            addCriterion("CAT_NO >=", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoLessThan(Short value) {
            addCriterion("CAT_NO <", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoLessThanOrEqualTo(Short value) {
            addCriterion("CAT_NO <=", value, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoIn(List<Short> values) {
            addCriterion("CAT_NO in", values, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoNotIn(List<Short> values) {
            addCriterion("CAT_NO not in", values, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoBetween(Short value1, Short value2) {
            addCriterion("CAT_NO between", value1, value2, "catNo");
            return (Criteria) this;
        }

        public Criteria andCatNoNotBetween(Short value1, Short value2) {
            addCriterion("CAT_NO not between", value1, value2, "catNo");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("PART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("PART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("PART_NAME =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("PART_NAME <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("PART_NAME >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("PART_NAME >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("PART_NAME <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("PART_NAME <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("PART_NAME like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("PART_NAME not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("PART_NAME in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("PART_NAME not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("PART_NAME between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("PART_NAME not between", value1, value2, "partName");
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