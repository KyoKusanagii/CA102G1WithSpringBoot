package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveExample() {
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

        public Criteria andLiveNoIsNull() {
            addCriterion("LIVE_NO is null");
            return (Criteria) this;
        }

        public Criteria andLiveNoIsNotNull() {
            addCriterion("LIVE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLiveNoEqualTo(String value) {
            addCriterion("LIVE_NO =", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotEqualTo(String value) {
            addCriterion("LIVE_NO <>", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoGreaterThan(String value) {
            addCriterion("LIVE_NO >", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_NO >=", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLessThan(String value) {
            addCriterion("LIVE_NO <", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLessThanOrEqualTo(String value) {
            addCriterion("LIVE_NO <=", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoLike(String value) {
            addCriterion("LIVE_NO like", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotLike(String value) {
            addCriterion("LIVE_NO not like", value, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoIn(List<String> values) {
            addCriterion("LIVE_NO in", values, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotIn(List<String> values) {
            addCriterion("LIVE_NO not in", values, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoBetween(String value1, String value2) {
            addCriterion("LIVE_NO between", value1, value2, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveNoNotBetween(String value1, String value2) {
            addCriterion("LIVE_NO not between", value1, value2, "liveNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoIsNull() {
            addCriterion("LIVE_SELLER_NO is null");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoIsNotNull() {
            addCriterion("LIVE_SELLER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoEqualTo(String value) {
            addCriterion("LIVE_SELLER_NO =", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoNotEqualTo(String value) {
            addCriterion("LIVE_SELLER_NO <>", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoGreaterThan(String value) {
            addCriterion("LIVE_SELLER_NO >", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_SELLER_NO >=", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoLessThan(String value) {
            addCriterion("LIVE_SELLER_NO <", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoLessThanOrEqualTo(String value) {
            addCriterion("LIVE_SELLER_NO <=", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoLike(String value) {
            addCriterion("LIVE_SELLER_NO like", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoNotLike(String value) {
            addCriterion("LIVE_SELLER_NO not like", value, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoIn(List<String> values) {
            addCriterion("LIVE_SELLER_NO in", values, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoNotIn(List<String> values) {
            addCriterion("LIVE_SELLER_NO not in", values, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoBetween(String value1, String value2) {
            addCriterion("LIVE_SELLER_NO between", value1, value2, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveSellerNoNotBetween(String value1, String value2) {
            addCriterion("LIVE_SELLER_NO not between", value1, value2, "liveSellerNo");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("LIVE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("LIVE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("LIVE_ADDRESS =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("LIVE_ADDRESS <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("LIVE_ADDRESS >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDRESS >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("LIVE_ADDRESS <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDRESS <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("LIVE_ADDRESS like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("LIVE_ADDRESS not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("LIVE_ADDRESS in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("LIVE_ADDRESS not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("LIVE_ADDRESS between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("LIVE_ADDRESS not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNull() {
            addCriterion("LIVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNotNull() {
            addCriterion("LIVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusEqualTo(Short value) {
            addCriterion("LIVE_STATUS =", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotEqualTo(Short value) {
            addCriterion("LIVE_STATUS <>", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThan(Short value) {
            addCriterion("LIVE_STATUS >", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("LIVE_STATUS >=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThan(Short value) {
            addCriterion("LIVE_STATUS <", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThanOrEqualTo(Short value) {
            addCriterion("LIVE_STATUS <=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIn(List<Short> values) {
            addCriterion("LIVE_STATUS in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotIn(List<Short> values) {
            addCriterion("LIVE_STATUS not in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusBetween(Short value1, Short value2) {
            addCriterion("LIVE_STATUS between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotBetween(Short value1, Short value2) {
            addCriterion("LIVE_STATUS not between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeIsNull() {
            addCriterion("LIVE_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeIsNotNull() {
            addCriterion("LIVE_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeEqualTo(Date value) {
            addCriterion("LIVE_START_TIME =", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeNotEqualTo(Date value) {
            addCriterion("LIVE_START_TIME <>", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeGreaterThan(Date value) {
            addCriterion("LIVE_START_TIME >", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVE_START_TIME >=", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeLessThan(Date value) {
            addCriterion("LIVE_START_TIME <", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("LIVE_START_TIME <=", value, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeIn(List<Date> values) {
            addCriterion("LIVE_START_TIME in", values, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeNotIn(List<Date> values) {
            addCriterion("LIVE_START_TIME not in", values, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeBetween(Date value1, Date value2) {
            addCriterion("LIVE_START_TIME between", value1, value2, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("LIVE_START_TIME not between", value1, value2, "liveStartTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeIsNull() {
            addCriterion("LIVE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeIsNotNull() {
            addCriterion("LIVE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeEqualTo(Date value) {
            addCriterion("LIVE_END_TIME =", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeNotEqualTo(Date value) {
            addCriterion("LIVE_END_TIME <>", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeGreaterThan(Date value) {
            addCriterion("LIVE_END_TIME >", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LIVE_END_TIME >=", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeLessThan(Date value) {
            addCriterion("LIVE_END_TIME <", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("LIVE_END_TIME <=", value, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeIn(List<Date> values) {
            addCriterion("LIVE_END_TIME in", values, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeNotIn(List<Date> values) {
            addCriterion("LIVE_END_TIME not in", values, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeBetween(Date value1, Date value2) {
            addCriterion("LIVE_END_TIME between", value1, value2, "liveEndTime");
            return (Criteria) this;
        }

        public Criteria andLiveEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("LIVE_END_TIME not between", value1, value2, "liveEndTime");
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