package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallOrderExample() {
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

        public Criteria andMallBuyerNoIsNull() {
            addCriterion("MALL_BUYER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoIsNotNull() {
            addCriterion("MALL_BUYER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoEqualTo(String value) {
            addCriterion("MALL_BUYER_NO =", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoNotEqualTo(String value) {
            addCriterion("MALL_BUYER_NO <>", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoGreaterThan(String value) {
            addCriterion("MALL_BUYER_NO >", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_BUYER_NO >=", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoLessThan(String value) {
            addCriterion("MALL_BUYER_NO <", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoLessThanOrEqualTo(String value) {
            addCriterion("MALL_BUYER_NO <=", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoLike(String value) {
            addCriterion("MALL_BUYER_NO like", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoNotLike(String value) {
            addCriterion("MALL_BUYER_NO not like", value, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoIn(List<String> values) {
            addCriterion("MALL_BUYER_NO in", values, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoNotIn(List<String> values) {
            addCriterion("MALL_BUYER_NO not in", values, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoBetween(String value1, String value2) {
            addCriterion("MALL_BUYER_NO between", value1, value2, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallBuyerNoNotBetween(String value1, String value2) {
            addCriterion("MALL_BUYER_NO not between", value1, value2, "mallBuyerNo");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeIsNull() {
            addCriterion("MALL_ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeIsNotNull() {
            addCriterion("MALL_ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeEqualTo(Date value) {
            addCriterion("MALL_ORDER_TIME =", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeNotEqualTo(Date value) {
            addCriterion("MALL_ORDER_TIME <>", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeGreaterThan(Date value) {
            addCriterion("MALL_ORDER_TIME >", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MALL_ORDER_TIME >=", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeLessThan(Date value) {
            addCriterion("MALL_ORDER_TIME <", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("MALL_ORDER_TIME <=", value, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeIn(List<Date> values) {
            addCriterion("MALL_ORDER_TIME in", values, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeNotIn(List<Date> values) {
            addCriterion("MALL_ORDER_TIME not in", values, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeBetween(Date value1, Date value2) {
            addCriterion("MALL_ORDER_TIME between", value1, value2, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("MALL_ORDER_TIME not between", value1, value2, "mallOrderTime");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcIsNull() {
            addCriterion("MALL_ORDER_PRC is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcIsNotNull() {
            addCriterion("MALL_ORDER_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcEqualTo(Long value) {
            addCriterion("MALL_ORDER_PRC =", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcNotEqualTo(Long value) {
            addCriterion("MALL_ORDER_PRC <>", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcGreaterThan(Long value) {
            addCriterion("MALL_ORDER_PRC >", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcGreaterThanOrEqualTo(Long value) {
            addCriterion("MALL_ORDER_PRC >=", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcLessThan(Long value) {
            addCriterion("MALL_ORDER_PRC <", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcLessThanOrEqualTo(Long value) {
            addCriterion("MALL_ORDER_PRC <=", value, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcIn(List<Long> values) {
            addCriterion("MALL_ORDER_PRC in", values, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcNotIn(List<Long> values) {
            addCriterion("MALL_ORDER_PRC not in", values, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcBetween(Long value1, Long value2) {
            addCriterion("MALL_ORDER_PRC between", value1, value2, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderPrcNotBetween(Long value1, Long value2) {
            addCriterion("MALL_ORDER_PRC not between", value1, value2, "mallOrderPrc");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransIsNull() {
            addCriterion("MALL_ORDER_TRANS is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransIsNotNull() {
            addCriterion("MALL_ORDER_TRANS is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransEqualTo(String value) {
            addCriterion("MALL_ORDER_TRANS =", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransNotEqualTo(String value) {
            addCriterion("MALL_ORDER_TRANS <>", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransGreaterThan(String value) {
            addCriterion("MALL_ORDER_TRANS >", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_TRANS >=", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransLessThan(String value) {
            addCriterion("MALL_ORDER_TRANS <", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransLessThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_TRANS <=", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransLike(String value) {
            addCriterion("MALL_ORDER_TRANS like", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransNotLike(String value) {
            addCriterion("MALL_ORDER_TRANS not like", value, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransIn(List<String> values) {
            addCriterion("MALL_ORDER_TRANS in", values, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransNotIn(List<String> values) {
            addCriterion("MALL_ORDER_TRANS not in", values, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_TRANS between", value1, value2, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderTransNotBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_TRANS not between", value1, value2, "mallOrderTrans");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusIsNull() {
            addCriterion("MALL_ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusIsNotNull() {
            addCriterion("MALL_ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusEqualTo(String value) {
            addCriterion("MALL_ORDER_STATUS =", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusNotEqualTo(String value) {
            addCriterion("MALL_ORDER_STATUS <>", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusGreaterThan(String value) {
            addCriterion("MALL_ORDER_STATUS >", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_STATUS >=", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusLessThan(String value) {
            addCriterion("MALL_ORDER_STATUS <", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_STATUS <=", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusLike(String value) {
            addCriterion("MALL_ORDER_STATUS like", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusNotLike(String value) {
            addCriterion("MALL_ORDER_STATUS not like", value, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusIn(List<String> values) {
            addCriterion("MALL_ORDER_STATUS in", values, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusNotIn(List<String> values) {
            addCriterion("MALL_ORDER_STATUS not in", values, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_STATUS between", value1, value2, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderStatusNotBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_STATUS not between", value1, value2, "mallOrderStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusIsNull() {
            addCriterion("MALL_PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusIsNotNull() {
            addCriterion("MALL_PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusEqualTo(String value) {
            addCriterion("MALL_PAY_STATUS =", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusNotEqualTo(String value) {
            addCriterion("MALL_PAY_STATUS <>", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusGreaterThan(String value) {
            addCriterion("MALL_PAY_STATUS >", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_PAY_STATUS >=", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusLessThan(String value) {
            addCriterion("MALL_PAY_STATUS <", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusLessThanOrEqualTo(String value) {
            addCriterion("MALL_PAY_STATUS <=", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusLike(String value) {
            addCriterion("MALL_PAY_STATUS like", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusNotLike(String value) {
            addCriterion("MALL_PAY_STATUS not like", value, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusIn(List<String> values) {
            addCriterion("MALL_PAY_STATUS in", values, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusNotIn(List<String> values) {
            addCriterion("MALL_PAY_STATUS not in", values, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusBetween(String value1, String value2) {
            addCriterion("MALL_PAY_STATUS between", value1, value2, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallPayStatusNotBetween(String value1, String value2) {
            addCriterion("MALL_PAY_STATUS not between", value1, value2, "mallPayStatus");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkIsNull() {
            addCriterion("MALL_ORDER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkIsNotNull() {
            addCriterion("MALL_ORDER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkEqualTo(String value) {
            addCriterion("MALL_ORDER_REMARK =", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkNotEqualTo(String value) {
            addCriterion("MALL_ORDER_REMARK <>", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkGreaterThan(String value) {
            addCriterion("MALL_ORDER_REMARK >", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_REMARK >=", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkLessThan(String value) {
            addCriterion("MALL_ORDER_REMARK <", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("MALL_ORDER_REMARK <=", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkLike(String value) {
            addCriterion("MALL_ORDER_REMARK like", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkNotLike(String value) {
            addCriterion("MALL_ORDER_REMARK not like", value, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkIn(List<String> values) {
            addCriterion("MALL_ORDER_REMARK in", values, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkNotIn(List<String> values) {
            addCriterion("MALL_ORDER_REMARK not in", values, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_REMARK between", value1, value2, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("MALL_ORDER_REMARK not between", value1, value2, "mallOrderRemark");
            return (Criteria) this;
        }

        public Criteria andMallTransportIsNull() {
            addCriterion("MALL_TRANSPORT is null");
            return (Criteria) this;
        }

        public Criteria andMallTransportIsNotNull() {
            addCriterion("MALL_TRANSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andMallTransportEqualTo(String value) {
            addCriterion("MALL_TRANSPORT =", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportNotEqualTo(String value) {
            addCriterion("MALL_TRANSPORT <>", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportGreaterThan(String value) {
            addCriterion("MALL_TRANSPORT >", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportGreaterThanOrEqualTo(String value) {
            addCriterion("MALL_TRANSPORT >=", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportLessThan(String value) {
            addCriterion("MALL_TRANSPORT <", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportLessThanOrEqualTo(String value) {
            addCriterion("MALL_TRANSPORT <=", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportLike(String value) {
            addCriterion("MALL_TRANSPORT like", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportNotLike(String value) {
            addCriterion("MALL_TRANSPORT not like", value, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportIn(List<String> values) {
            addCriterion("MALL_TRANSPORT in", values, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportNotIn(List<String> values) {
            addCriterion("MALL_TRANSPORT not in", values, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportBetween(String value1, String value2) {
            addCriterion("MALL_TRANSPORT between", value1, value2, "mallTransport");
            return (Criteria) this;
        }

        public Criteria andMallTransportNotBetween(String value1, String value2) {
            addCriterion("MALL_TRANSPORT not between", value1, value2, "mallTransport");
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