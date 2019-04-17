package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class CarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarouselExample() {
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

        public Criteria andCarouselNoIsNull() {
            addCriterion("CAROUSEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCarouselNoIsNotNull() {
            addCriterion("CAROUSEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselNoEqualTo(Long value) {
            addCriterion("CAROUSEL_NO =", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoNotEqualTo(Long value) {
            addCriterion("CAROUSEL_NO <>", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoGreaterThan(Long value) {
            addCriterion("CAROUSEL_NO >", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CAROUSEL_NO >=", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoLessThan(Long value) {
            addCriterion("CAROUSEL_NO <", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoLessThanOrEqualTo(Long value) {
            addCriterion("CAROUSEL_NO <=", value, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoIn(List<Long> values) {
            addCriterion("CAROUSEL_NO in", values, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoNotIn(List<Long> values) {
            addCriterion("CAROUSEL_NO not in", values, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoBetween(Long value1, Long value2) {
            addCriterion("CAROUSEL_NO between", value1, value2, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselNoNotBetween(Long value1, Long value2) {
            addCriterion("CAROUSEL_NO not between", value1, value2, "carouselNo");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleIsNull() {
            addCriterion("CAROUSEL_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleIsNotNull() {
            addCriterion("CAROUSEL_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleEqualTo(String value) {
            addCriterion("CAROUSEL_TITLE =", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleNotEqualTo(String value) {
            addCriterion("CAROUSEL_TITLE <>", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleGreaterThan(String value) {
            addCriterion("CAROUSEL_TITLE >", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CAROUSEL_TITLE >=", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleLessThan(String value) {
            addCriterion("CAROUSEL_TITLE <", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleLessThanOrEqualTo(String value) {
            addCriterion("CAROUSEL_TITLE <=", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleLike(String value) {
            addCriterion("CAROUSEL_TITLE like", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleNotLike(String value) {
            addCriterion("CAROUSEL_TITLE not like", value, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleIn(List<String> values) {
            addCriterion("CAROUSEL_TITLE in", values, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleNotIn(List<String> values) {
            addCriterion("CAROUSEL_TITLE not in", values, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleBetween(String value1, String value2) {
            addCriterion("CAROUSEL_TITLE between", value1, value2, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselTitleNotBetween(String value1, String value2) {
            addCriterion("CAROUSEL_TITLE not between", value1, value2, "carouselTitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleIsNull() {
            addCriterion("CAROUSEL_SUBTITLE is null");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleIsNotNull() {
            addCriterion("CAROUSEL_SUBTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleEqualTo(String value) {
            addCriterion("CAROUSEL_SUBTITLE =", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleNotEqualTo(String value) {
            addCriterion("CAROUSEL_SUBTITLE <>", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleGreaterThan(String value) {
            addCriterion("CAROUSEL_SUBTITLE >", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("CAROUSEL_SUBTITLE >=", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleLessThan(String value) {
            addCriterion("CAROUSEL_SUBTITLE <", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleLessThanOrEqualTo(String value) {
            addCriterion("CAROUSEL_SUBTITLE <=", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleLike(String value) {
            addCriterion("CAROUSEL_SUBTITLE like", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleNotLike(String value) {
            addCriterion("CAROUSEL_SUBTITLE not like", value, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleIn(List<String> values) {
            addCriterion("CAROUSEL_SUBTITLE in", values, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleNotIn(List<String> values) {
            addCriterion("CAROUSEL_SUBTITLE not in", values, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleBetween(String value1, String value2) {
            addCriterion("CAROUSEL_SUBTITLE between", value1, value2, "carouselSubtitle");
            return (Criteria) this;
        }

        public Criteria andCarouselSubtitleNotBetween(String value1, String value2) {
            addCriterion("CAROUSEL_SUBTITLE not between", value1, value2, "carouselSubtitle");
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