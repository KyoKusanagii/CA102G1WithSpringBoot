package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbOrderExample() {
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

        public Criteria andFbBuyerNoIsNull() {
            addCriterion("FB_BUYER_NO is null");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoIsNotNull() {
            addCriterion("FB_BUYER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoEqualTo(String value) {
            addCriterion("FB_BUYER_NO =", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoNotEqualTo(String value) {
            addCriterion("FB_BUYER_NO <>", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoGreaterThan(String value) {
            addCriterion("FB_BUYER_NO >", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoGreaterThanOrEqualTo(String value) {
            addCriterion("FB_BUYER_NO >=", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoLessThan(String value) {
            addCriterion("FB_BUYER_NO <", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoLessThanOrEqualTo(String value) {
            addCriterion("FB_BUYER_NO <=", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoLike(String value) {
            addCriterion("FB_BUYER_NO like", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoNotLike(String value) {
            addCriterion("FB_BUYER_NO not like", value, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoIn(List<String> values) {
            addCriterion("FB_BUYER_NO in", values, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoNotIn(List<String> values) {
            addCriterion("FB_BUYER_NO not in", values, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoBetween(String value1, String value2) {
            addCriterion("FB_BUYER_NO between", value1, value2, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbBuyerNoNotBetween(String value1, String value2) {
            addCriterion("FB_BUYER_NO not between", value1, value2, "fbBuyerNo");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeIsNull() {
            addCriterion("FB_ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeIsNotNull() {
            addCriterion("FB_ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeEqualTo(Date value) {
            addCriterion("FB_ORDER_TIME =", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeNotEqualTo(Date value) {
            addCriterion("FB_ORDER_TIME <>", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeGreaterThan(Date value) {
            addCriterion("FB_ORDER_TIME >", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FB_ORDER_TIME >=", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeLessThan(Date value) {
            addCriterion("FB_ORDER_TIME <", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("FB_ORDER_TIME <=", value, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeIn(List<Date> values) {
            addCriterion("FB_ORDER_TIME in", values, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeNotIn(List<Date> values) {
            addCriterion("FB_ORDER_TIME not in", values, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeBetween(Date value1, Date value2) {
            addCriterion("FB_ORDER_TIME between", value1, value2, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("FB_ORDER_TIME not between", value1, value2, "fbOrderTime");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcIsNull() {
            addCriterion("FB_ORDER_PRC is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcIsNotNull() {
            addCriterion("FB_ORDER_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcEqualTo(Long value) {
            addCriterion("FB_ORDER_PRC =", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcNotEqualTo(Long value) {
            addCriterion("FB_ORDER_PRC <>", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcGreaterThan(Long value) {
            addCriterion("FB_ORDER_PRC >", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcGreaterThanOrEqualTo(Long value) {
            addCriterion("FB_ORDER_PRC >=", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcLessThan(Long value) {
            addCriterion("FB_ORDER_PRC <", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcLessThanOrEqualTo(Long value) {
            addCriterion("FB_ORDER_PRC <=", value, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcIn(List<Long> values) {
            addCriterion("FB_ORDER_PRC in", values, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcNotIn(List<Long> values) {
            addCriterion("FB_ORDER_PRC not in", values, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcBetween(Long value1, Long value2) {
            addCriterion("FB_ORDER_PRC between", value1, value2, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderPrcNotBetween(Long value1, Long value2) {
            addCriterion("FB_ORDER_PRC not between", value1, value2, "fbOrderPrc");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransIsNull() {
            addCriterion("FB_ORDER_TRANS is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransIsNotNull() {
            addCriterion("FB_ORDER_TRANS is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransEqualTo(String value) {
            addCriterion("FB_ORDER_TRANS =", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransNotEqualTo(String value) {
            addCriterion("FB_ORDER_TRANS <>", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransGreaterThan(String value) {
            addCriterion("FB_ORDER_TRANS >", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransGreaterThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_TRANS >=", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransLessThan(String value) {
            addCriterion("FB_ORDER_TRANS <", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransLessThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_TRANS <=", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransLike(String value) {
            addCriterion("FB_ORDER_TRANS like", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransNotLike(String value) {
            addCriterion("FB_ORDER_TRANS not like", value, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransIn(List<String> values) {
            addCriterion("FB_ORDER_TRANS in", values, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransNotIn(List<String> values) {
            addCriterion("FB_ORDER_TRANS not in", values, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransBetween(String value1, String value2) {
            addCriterion("FB_ORDER_TRANS between", value1, value2, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderTransNotBetween(String value1, String value2) {
            addCriterion("FB_ORDER_TRANS not between", value1, value2, "fbOrderTrans");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusIsNull() {
            addCriterion("FB_ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusIsNotNull() {
            addCriterion("FB_ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusEqualTo(String value) {
            addCriterion("FB_ORDER_STATUS =", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusNotEqualTo(String value) {
            addCriterion("FB_ORDER_STATUS <>", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusGreaterThan(String value) {
            addCriterion("FB_ORDER_STATUS >", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_STATUS >=", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusLessThan(String value) {
            addCriterion("FB_ORDER_STATUS <", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_STATUS <=", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusLike(String value) {
            addCriterion("FB_ORDER_STATUS like", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusNotLike(String value) {
            addCriterion("FB_ORDER_STATUS not like", value, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusIn(List<String> values) {
            addCriterion("FB_ORDER_STATUS in", values, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusNotIn(List<String> values) {
            addCriterion("FB_ORDER_STATUS not in", values, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusBetween(String value1, String value2) {
            addCriterion("FB_ORDER_STATUS between", value1, value2, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderStatusNotBetween(String value1, String value2) {
            addCriterion("FB_ORDER_STATUS not between", value1, value2, "fbOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusIsNull() {
            addCriterion("FB_PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusIsNotNull() {
            addCriterion("FB_PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusEqualTo(String value) {
            addCriterion("FB_PAY_STATUS =", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusNotEqualTo(String value) {
            addCriterion("FB_PAY_STATUS <>", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusGreaterThan(String value) {
            addCriterion("FB_PAY_STATUS >", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FB_PAY_STATUS >=", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusLessThan(String value) {
            addCriterion("FB_PAY_STATUS <", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusLessThanOrEqualTo(String value) {
            addCriterion("FB_PAY_STATUS <=", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusLike(String value) {
            addCriterion("FB_PAY_STATUS like", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusNotLike(String value) {
            addCriterion("FB_PAY_STATUS not like", value, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusIn(List<String> values) {
            addCriterion("FB_PAY_STATUS in", values, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusNotIn(List<String> values) {
            addCriterion("FB_PAY_STATUS not in", values, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusBetween(String value1, String value2) {
            addCriterion("FB_PAY_STATUS between", value1, value2, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbPayStatusNotBetween(String value1, String value2) {
            addCriterion("FB_PAY_STATUS not between", value1, value2, "fbPayStatus");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkIsNull() {
            addCriterion("FB_ORDER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkIsNotNull() {
            addCriterion("FB_ORDER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkEqualTo(String value) {
            addCriterion("FB_ORDER_REMARK =", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkNotEqualTo(String value) {
            addCriterion("FB_ORDER_REMARK <>", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkGreaterThan(String value) {
            addCriterion("FB_ORDER_REMARK >", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_REMARK >=", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkLessThan(String value) {
            addCriterion("FB_ORDER_REMARK <", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("FB_ORDER_REMARK <=", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkLike(String value) {
            addCriterion("FB_ORDER_REMARK like", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkNotLike(String value) {
            addCriterion("FB_ORDER_REMARK not like", value, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkIn(List<String> values) {
            addCriterion("FB_ORDER_REMARK in", values, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkNotIn(List<String> values) {
            addCriterion("FB_ORDER_REMARK not in", values, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkBetween(String value1, String value2) {
            addCriterion("FB_ORDER_REMARK between", value1, value2, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("FB_ORDER_REMARK not between", value1, value2, "fbOrderRemark");
            return (Criteria) this;
        }

        public Criteria andFbTransportIsNull() {
            addCriterion("FB_TRANSPORT is null");
            return (Criteria) this;
        }

        public Criteria andFbTransportIsNotNull() {
            addCriterion("FB_TRANSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andFbTransportEqualTo(String value) {
            addCriterion("FB_TRANSPORT =", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportNotEqualTo(String value) {
            addCriterion("FB_TRANSPORT <>", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportGreaterThan(String value) {
            addCriterion("FB_TRANSPORT >", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportGreaterThanOrEqualTo(String value) {
            addCriterion("FB_TRANSPORT >=", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportLessThan(String value) {
            addCriterion("FB_TRANSPORT <", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportLessThanOrEqualTo(String value) {
            addCriterion("FB_TRANSPORT <=", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportLike(String value) {
            addCriterion("FB_TRANSPORT like", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportNotLike(String value) {
            addCriterion("FB_TRANSPORT not like", value, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportIn(List<String> values) {
            addCriterion("FB_TRANSPORT in", values, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportNotIn(List<String> values) {
            addCriterion("FB_TRANSPORT not in", values, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportBetween(String value1, String value2) {
            addCriterion("FB_TRANSPORT between", value1, value2, "fbTransport");
            return (Criteria) this;
        }

        public Criteria andFbTransportNotBetween(String value1, String value2) {
            addCriterion("FB_TRANSPORT not between", value1, value2, "fbTransport");
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