package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class MallOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallOrderItemExample() {
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

        public Criteria andMallOrderNoIsNull() {
            addCriterion("MALL_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoIsNotNull() {
            addCriterion("MALL_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoEqualTo(String value) {
            addCriterion("MALL_ORDER_NO =", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoNotEqualTo(String value) {
            addCriterion("MALL_ORDER_NO <>", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoGreaterThan(String value) {
            addCriterion("MALL_ORDER_NO >", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_NO >=", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoLessThan(String value) {
            addCriterion("MALL_ORDER_NO <", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoLessThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_NO <=", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoLike(String value) {
            addCriterion("MALL_ORDER_NO like", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoNotLike(String value) {
            addCriterion("MALL_ORDER_NO not like", value, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoIn(List<String> values) {
            addCriterion("MALL_ORDER_NO in", values, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoNotIn(List<String> values) {
            addCriterion("MALL_ORDER_NO not in", values, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_NO between", value1, value2, "mallOrderNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderNoNotBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_NO not between", value1, value2, "mallOrderNo");
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

        public Criteria andIsItemSaleIsNull() {
            addCriterion("IS_ITEM_SALE is null");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleIsNotNull() {
            addCriterion("IS_ITEM_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleEqualTo(Short value) {
            addCriterion("IS_ITEM_SALE =", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleNotEqualTo(Short value) {
            addCriterion("IS_ITEM_SALE <>", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleGreaterThan(Short value) {
            addCriterion("IS_ITEM_SALE >", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_ITEM_SALE >=", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleLessThan(Short value) {
            addCriterion("IS_ITEM_SALE <", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleLessThanOrEqualTo(Short value) {
            addCriterion("IS_ITEM_SALE <=", value, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleIn(List<Short> values) {
            addCriterion("IS_ITEM_SALE in", values, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleNotIn(List<Short> values) {
            addCriterion("IS_ITEM_SALE not in", values, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleBetween(Short value1, Short value2) {
            addCriterion("IS_ITEM_SALE between", value1, value2, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andIsItemSaleNotBetween(Short value1, Short value2) {
            addCriterion("IS_ITEM_SALE not between", value1, value2, "isItemSale");
            return (Criteria) this;
        }

        public Criteria andMallItemCntIsNull() {
            addCriterion("MALL_ITEM_CNT is null");
            return (Criteria) this;
        }

        public Criteria andMallItemCntIsNotNull() {
            addCriterion("MALL_ITEM_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andMallItemCntEqualTo(Long value) {
            addCriterion("MALL_ITEM_CNT =", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntNotEqualTo(Long value) {
            addCriterion("MALL_ITEM_CNT <>", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntGreaterThan(Long value) {
            addCriterion("MALL_ITEM_CNT >", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_ITEM_CNT >=", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntLessThan(Long value) {
            addCriterion("MALL_ITEM_CNT <", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntLessThanOrEqualTo(Long value) {
            addCriterion("MALL_ITEM_CNT <=", value, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntIn(List<Long> values) {
            addCriterion("MALL_ITEM_CNT in", values, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntNotIn(List<Long> values) {
            addCriterion("MALL_ITEM_CNT not in", values, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntBetween(Long value1, Long value2) {
            addCriterion("MALL_ITEM_CNT between", value1, value2, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemCntNotBetween(Long value1, Long value2) {
            addCriterion("MALL_ITEM_CNT not between", value1, value2, "mallItemCnt");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcIsNull() {
            addCriterion("MALL_ITEM_PRC is null");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcIsNotNull() {
            addCriterion("MALL_ITEM_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcEqualTo(Long value) {
            addCriterion("MALL_ITEM_PRC =", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcNotEqualTo(Long value) {
            addCriterion("MALL_ITEM_PRC <>", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcGreaterThan(Long value) {
            addCriterion("MALL_ITEM_PRC >", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_ITEM_PRC >=", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcLessThan(Long value) {
            addCriterion("MALL_ITEM_PRC <", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcLessThanOrEqualTo(Long value) {
            addCriterion("MALL_ITEM_PRC <=", value, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcIn(List<Long> values) {
            addCriterion("MALL_ITEM_PRC in", values, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcNotIn(List<Long> values) {
            addCriterion("MALL_ITEM_PRC not in", values, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcBetween(Long value1, Long value2) {
            addCriterion("MALL_ITEM_PRC between", value1, value2, "mallItemPrc");
            return (Criteria) this;
        }

        public Criteria andMallItemPrcNotBetween(Long value1, Long value2) {
            addCriterion("MALL_ITEM_PRC not between", value1, value2, "mallItemPrc");
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