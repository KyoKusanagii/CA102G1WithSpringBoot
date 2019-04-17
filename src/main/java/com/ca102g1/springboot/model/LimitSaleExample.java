package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LimitSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitSaleExample() {
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

        public Criteria andSaleNoIsNull() {
            addCriterion("SALE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleNoIsNotNull() {
            addCriterion("SALE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNoEqualTo(Long value) {
            addCriterion("SALE_NO =", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotEqualTo(Long value) {
            addCriterion("SALE_NO <>", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThan(Long value) {
            addCriterion("SALE_NO >", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_NO >=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThan(Long value) {
            addCriterion("SALE_NO <", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoLessThanOrEqualTo(Long value) {
            addCriterion("SALE_NO <=", value, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoIn(List<Long> values) {
            addCriterion("SALE_NO in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotIn(List<Long> values) {
            addCriterion("SALE_NO not in", values, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoBetween(Long value1, Long value2) {
            addCriterion("SALE_NO between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andSaleNoNotBetween(Long value1, Long value2) {
            addCriterion("SALE_NO not between", value1, value2, "saleNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("ITEM_NO =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("ITEM_NO <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("ITEM_NO >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NO >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("ITEM_NO <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NO <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("ITEM_NO like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("ITEM_NO not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("ITEM_NO in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("ITEM_NO not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("ITEM_NO between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("ITEM_NO not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andSaleStartIsNull() {
            addCriterion("SALE_START is null");
            return (Criteria) this;
        }

        public Criteria andSaleStartIsNotNull() {
            addCriterion("SALE_START is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStartEqualTo(Date value) {
            addCriterion("SALE_START =", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartNotEqualTo(Date value) {
            addCriterion("SALE_START <>", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartGreaterThan(Date value) {
            addCriterion("SALE_START >", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_START >=", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartLessThan(Date value) {
            addCriterion("SALE_START <", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartLessThanOrEqualTo(Date value) {
            addCriterion("SALE_START <=", value, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartIn(List<Date> values) {
            addCriterion("SALE_START in", values, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartNotIn(List<Date> values) {
            addCriterion("SALE_START not in", values, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartBetween(Date value1, Date value2) {
            addCriterion("SALE_START between", value1, value2, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleStartNotBetween(Date value1, Date value2) {
            addCriterion("SALE_START not between", value1, value2, "saleStart");
            return (Criteria) this;
        }

        public Criteria andSaleEndIsNull() {
            addCriterion("SALE_END is null");
            return (Criteria) this;
        }

        public Criteria andSaleEndIsNotNull() {
            addCriterion("SALE_END is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEndEqualTo(Date value) {
            addCriterion("SALE_END =", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndNotEqualTo(Date value) {
            addCriterion("SALE_END <>", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndGreaterThan(Date value) {
            addCriterion("SALE_END >", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_END >=", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndLessThan(Date value) {
            addCriterion("SALE_END <", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndLessThanOrEqualTo(Date value) {
            addCriterion("SALE_END <=", value, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndIn(List<Date> values) {
            addCriterion("SALE_END in", values, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndNotIn(List<Date> values) {
            addCriterion("SALE_END not in", values, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndBetween(Date value1, Date value2) {
            addCriterion("SALE_END between", value1, value2, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSaleEndNotBetween(Date value1, Date value2) {
            addCriterion("SALE_END not between", value1, value2, "saleEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Long value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Long value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Long value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Long value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Long value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Long> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Long> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Long value1, Long value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("SALE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("SALE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Short value) {
            addCriterion("SALE_STATUS =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Short value) {
            addCriterion("SALE_STATUS <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Short value) {
            addCriterion("SALE_STATUS >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("SALE_STATUS >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Short value) {
            addCriterion("SALE_STATUS <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Short value) {
            addCriterion("SALE_STATUS <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Short> values) {
            addCriterion("SALE_STATUS in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Short> values) {
            addCriterion("SALE_STATUS not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Short value1, Short value2) {
            addCriterion("SALE_STATUS between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Short value1, Short value2) {
            addCriterion("SALE_STATUS not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIsNull() {
            addCriterion("SALE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIsNotNull() {
            addCriterion("SALE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkEqualTo(String value) {
            addCriterion("SALE_REMARK =", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotEqualTo(String value) {
            addCriterion("SALE_REMARK <>", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkGreaterThan(String value) {
            addCriterion("SALE_REMARK >", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_REMARK >=", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLessThan(String value) {
            addCriterion("SALE_REMARK <", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLessThanOrEqualTo(String value) {
            addCriterion("SALE_REMARK <=", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkLike(String value) {
            addCriterion("SALE_REMARK like", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotLike(String value) {
            addCriterion("SALE_REMARK not like", value, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkIn(List<String> values) {
            addCriterion("SALE_REMARK in", values, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotIn(List<String> values) {
            addCriterion("SALE_REMARK not in", values, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkBetween(String value1, String value2) {
            addCriterion("SALE_REMARK between", value1, value2, "saleRemark");
            return (Criteria) this;
        }

        public Criteria andSaleRemarkNotBetween(String value1, String value2) {
            addCriterion("SALE_REMARK not between", value1, value2, "saleRemark");
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