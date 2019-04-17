package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArtiTopicIsNull() {
            addCriterion("ARTI_TOPIC is null");
            return (Criteria) this;
        }

        public Criteria andArtiTopicIsNotNull() {
            addCriterion("ARTI_TOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andArtiTopicEqualTo(String value) {
            addCriterion("ARTI_TOPIC =", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicNotEqualTo(String value) {
            addCriterion("ARTI_TOPIC <>", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicGreaterThan(String value) {
            addCriterion("ARTI_TOPIC >", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicGreaterThanOrEqualTo(String value) {
            addCriterion("ARTI_TOPIC >=", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicLessThan(String value) {
            addCriterion("ARTI_TOPIC <", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicLessThanOrEqualTo(String value) {
            addCriterion("ARTI_TOPIC <=", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicLike(String value) {
            addCriterion("ARTI_TOPIC like", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicNotLike(String value) {
            addCriterion("ARTI_TOPIC not like", value, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicIn(List<String> values) {
            addCriterion("ARTI_TOPIC in", values, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicNotIn(List<String> values) {
            addCriterion("ARTI_TOPIC not in", values, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicBetween(String value1, String value2) {
            addCriterion("ARTI_TOPIC between", value1, value2, "artiTopic");
            return (Criteria) this;
        }

        public Criteria andArtiTopicNotBetween(String value1, String value2) {
            addCriterion("ARTI_TOPIC not between", value1, value2, "artiTopic");
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

        public Criteria andPoTimeIsNull() {
            addCriterion("PO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPoTimeIsNotNull() {
            addCriterion("PO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPoTimeEqualTo(Date value) {
            addCriterion("PO_TIME =", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeNotEqualTo(Date value) {
            addCriterion("PO_TIME <>", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeGreaterThan(Date value) {
            addCriterion("PO_TIME >", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PO_TIME >=", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeLessThan(Date value) {
            addCriterion("PO_TIME <", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeLessThanOrEqualTo(Date value) {
            addCriterion("PO_TIME <=", value, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeIn(List<Date> values) {
            addCriterion("PO_TIME in", values, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeNotIn(List<Date> values) {
            addCriterion("PO_TIME not in", values, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeBetween(Date value1, Date value2) {
            addCriterion("PO_TIME between", value1, value2, "poTime");
            return (Criteria) this;
        }

        public Criteria andPoTimeNotBetween(Date value1, Date value2) {
            addCriterion("PO_TIME not between", value1, value2, "poTime");
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