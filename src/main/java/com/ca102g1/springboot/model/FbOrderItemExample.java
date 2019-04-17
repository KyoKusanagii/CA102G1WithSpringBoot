package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class FbOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbOrderItemExample() {
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

        public Criteria andFbOrderNoIsNull() {
            addCriterion("FB_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoIsNotNull() {
            addCriterion("FB_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoEqualTo(String value) {
            addCriterion("FB_ORDER_NO =", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoNotEqualTo(String value) {
            addCriterion("FB_ORDER_NO <>", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoGreaterThan(String value) {
            addCriterion("FB_ORDER_NO >", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_NO >=", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoLessThan(String value) {
            addCriterion("FB_ORDER_NO <", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoLessThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_NO <=", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoLike(String value) {
            addCriterion("FB_ORDER_NO like", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoNotLike(String value) {
            addCriterion("FB_ORDER_NO not like", value, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoIn(List<String> values) {
            addCriterion("FB_ORDER_NO in", values, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoNotIn(List<String> values) {
            addCriterion("FB_ORDER_NO not in", values, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoBetween(String value1, String value2) {
            addCriterion("FB_ORDER_NO between", value1, value2, "fbOrderNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderNoNotBetween(String value1, String value2) {
            addCriterion("FB_ORDER_NO not between", value1, value2, "fbOrderNo");
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

        public Criteria andFbItemCntIsNull() {
            addCriterion("FB_ITEM_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFbItemCntIsNotNull() {
            addCriterion("FB_ITEM_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFbItemCntEqualTo(Long value) {
            addCriterion("FB_ITEM_CNT =", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntNotEqualTo(Long value) {
            addCriterion("FB_ITEM_CNT <>", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntGreaterThan(Long value) {
            addCriterion("FB_ITEM_CNT >", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntGreaterThanOrEqualTo(Long value) {
            addCriterion("FB_ITEM_CNT >=", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntLessThan(Long value) {
            addCriterion("FB_ITEM_CNT <", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntLessThanOrEqualTo(Long value) {
            addCriterion("FB_ITEM_CNT <=", value, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntIn(List<Long> values) {
            addCriterion("FB_ITEM_CNT in", values, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntNotIn(List<Long> values) {
            addCriterion("FB_ITEM_CNT not in", values, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntBetween(Long value1, Long value2) {
            addCriterion("FB_ITEM_CNT between", value1, value2, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemCntNotBetween(Long value1, Long value2) {
            addCriterion("FB_ITEM_CNT not between", value1, value2, "fbItemCnt");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcIsNull() {
            addCriterion("FB_ITEM_PRC is null");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcIsNotNull() {
            addCriterion("FB_ITEM_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcEqualTo(Long value) {
            addCriterion("FB_ITEM_PRC =", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcNotEqualTo(Long value) {
            addCriterion("FB_ITEM_PRC <>", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcGreaterThan(Long value) {
            addCriterion("FB_ITEM_PRC >", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcGreaterThanOrEqualTo(Long value) {
            addCriterion("FB_ITEM_PRC >=", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcLessThan(Long value) {
            addCriterion("FB_ITEM_PRC <", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcLessThanOrEqualTo(Long value) {
            addCriterion("FB_ITEM_PRC <=", value, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcIn(List<Long> values) {
            addCriterion("FB_ITEM_PRC in", values, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcNotIn(List<Long> values) {
            addCriterion("FB_ITEM_PRC not in", values, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcBetween(Long value1, Long value2) {
            addCriterion("FB_ITEM_PRC between", value1, value2, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbItemPrcNotBetween(Long value1, Long value2) {
            addCriterion("FB_ITEM_PRC not between", value1, value2, "fbItemPrc");
            return (Criteria) this;
        }

        public Criteria andFbCommentIsNull() {
            addCriterion("FB_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andFbCommentIsNotNull() {
            addCriterion("FB_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFbCommentEqualTo(String value) {
            addCriterion("FB_COMMENT =", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentNotEqualTo(String value) {
            addCriterion("FB_COMMENT <>", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentGreaterThan(String value) {
            addCriterion("FB_COMMENT >", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentGreaterThanOrEqualTo(String value) {
            addCriterion("FB_COMMENT >=", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentLessThan(String value) {
            addCriterion("FB_COMMENT <", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentLessThanOrEqualTo(String value) {
            addCriterion("FB_COMMENT <=", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentLike(String value) {
            addCriterion("FB_COMMENT like", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentNotLike(String value) {
            addCriterion("FB_COMMENT not like", value, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentIn(List<String> values) {
            addCriterion("FB_COMMENT in", values, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentNotIn(List<String> values) {
            addCriterion("FB_COMMENT not in", values, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentBetween(String value1, String value2) {
            addCriterion("FB_COMMENT between", value1, value2, "fbComment");
            return (Criteria) this;
        }

        public Criteria andFbCommentNotBetween(String value1, String value2) {
            addCriterion("FB_COMMENT not between", value1, value2, "fbComment");
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