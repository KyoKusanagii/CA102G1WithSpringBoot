package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtiReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtiReplyExample() {
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

        public Criteria andArtiNoIsNull() {
            addCriterion("ARTI_NO is null");
            return (Criteria) this;
        }

        public Criteria andArtiNoIsNotNull() {
            addCriterion("ARTI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andArtiNoEqualTo(String value) {
            addCriterion("ARTI_NO =", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoNotEqualTo(String value) {
            addCriterion("ARTI_NO <>", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoGreaterThan(String value) {
            addCriterion("ARTI_NO >", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoGreaterThanOrEqualTo(String value) {
            addCriterion("ARTI_NO >=", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoLessThan(String value) {
            addCriterion("ARTI_NO <", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoLessThanOrEqualTo(String value) {
            addCriterion("ARTI_NO <=", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoLike(String value) {
            addCriterion("ARTI_NO like", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoNotLike(String value) {
            addCriterion("ARTI_NO not like", value, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoIn(List<String> values) {
            addCriterion("ARTI_NO in", values, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoNotIn(List<String> values) {
            addCriterion("ARTI_NO not in", values, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoBetween(String value1, String value2) {
            addCriterion("ARTI_NO between", value1, value2, "artiNo");
            return (Criteria) this;
        }

        public Criteria andArtiNoNotBetween(String value1, String value2) {
            addCriterion("ARTI_NO not between", value1, value2, "artiNo");
            return (Criteria) this;
        }

        public Criteria andRepNoIsNull() {
            addCriterion("REP_NO is null");
            return (Criteria) this;
        }

        public Criteria andRepNoIsNotNull() {
            addCriterion("REP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRepNoEqualTo(Integer value) {
            addCriterion("REP_NO =", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotEqualTo(Integer value) {
            addCriterion("REP_NO <>", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoGreaterThan(Integer value) {
            addCriterion("REP_NO >", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("REP_NO >=", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoLessThan(Integer value) {
            addCriterion("REP_NO <", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoLessThanOrEqualTo(Integer value) {
            addCriterion("REP_NO <=", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoIn(List<Integer> values) {
            addCriterion("REP_NO in", values, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotIn(List<Integer> values) {
            addCriterion("REP_NO not in", values, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoBetween(Integer value1, Integer value2) {
            addCriterion("REP_NO between", value1, value2, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotBetween(Integer value1, Integer value2) {
            addCriterion("REP_NO not between", value1, value2, "repNo");
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

        public Criteria andRepContentIsNull() {
            addCriterion("REP_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRepContentIsNotNull() {
            addCriterion("REP_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRepContentEqualTo(String value) {
            addCriterion("REP_CONTENT =", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotEqualTo(String value) {
            addCriterion("REP_CONTENT <>", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentGreaterThan(String value) {
            addCriterion("REP_CONTENT >", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentGreaterThanOrEqualTo(String value) {
            addCriterion("REP_CONTENT >=", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLessThan(String value) {
            addCriterion("REP_CONTENT <", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLessThanOrEqualTo(String value) {
            addCriterion("REP_CONTENT <=", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentLike(String value) {
            addCriterion("REP_CONTENT like", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotLike(String value) {
            addCriterion("REP_CONTENT not like", value, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentIn(List<String> values) {
            addCriterion("REP_CONTENT in", values, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotIn(List<String> values) {
            addCriterion("REP_CONTENT not in", values, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentBetween(String value1, String value2) {
            addCriterion("REP_CONTENT between", value1, value2, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepContentNotBetween(String value1, String value2) {
            addCriterion("REP_CONTENT not between", value1, value2, "repContent");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNull() {
            addCriterion("REP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNotNull() {
            addCriterion("REP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRepTimeEqualTo(Date value) {
            addCriterion("REP_TIME =", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotEqualTo(Date value) {
            addCriterion("REP_TIME <>", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThan(Date value) {
            addCriterion("REP_TIME >", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REP_TIME >=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThan(Date value) {
            addCriterion("REP_TIME <", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThanOrEqualTo(Date value) {
            addCriterion("REP_TIME <=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeIn(List<Date> values) {
            addCriterion("REP_TIME in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotIn(List<Date> values) {
            addCriterion("REP_TIME not in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeBetween(Date value1, Date value2) {
            addCriterion("REP_TIME between", value1, value2, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotBetween(Date value1, Date value2) {
            addCriterion("REP_TIME not between", value1, value2, "repTime");
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