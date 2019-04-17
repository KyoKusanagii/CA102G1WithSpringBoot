package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsNoIsNull() {
            addCriterion("NEWS_NO is null");
            return (Criteria) this;
        }

        public Criteria andNewsNoIsNotNull() {
            addCriterion("NEWS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNoEqualTo(Long value) {
            addCriterion("NEWS_NO =", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotEqualTo(Long value) {
            addCriterion("NEWS_NO <>", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoGreaterThan(Long value) {
            addCriterion("NEWS_NO >", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWS_NO >=", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoLessThan(Long value) {
            addCriterion("NEWS_NO <", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoLessThanOrEqualTo(Long value) {
            addCriterion("NEWS_NO <=", value, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoIn(List<Long> values) {
            addCriterion("NEWS_NO in", values, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotIn(List<Long> values) {
            addCriterion("NEWS_NO not in", values, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoBetween(Long value1, Long value2) {
            addCriterion("NEWS_NO between", value1, value2, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsNoNotBetween(Long value1, Long value2) {
            addCriterion("NEWS_NO not between", value1, value2, "newsNo");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("NEWS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("NEWS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("NEWS_DATE =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("NEWS_DATE <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("NEWS_DATE >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("NEWS_DATE <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("NEWS_DATE in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("NEWS_DATE not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE not between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("NEWS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("NEWS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("NEWS_TITLE =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("NEWS_TITLE <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("NEWS_TITLE >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("NEWS_TITLE <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("NEWS_TITLE like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("NEWS_TITLE not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("NEWS_TITLE in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("NEWS_TITLE not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE not between", value1, value2, "newsTitle");
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