package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class SpecialForuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialForuExample() {
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

        public Criteria andClothCntsIsNull() {
            addCriterion("CLOTH_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andClothCntsIsNotNull() {
            addCriterion("CLOTH_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andClothCntsEqualTo(Long value) {
            addCriterion("CLOTH_CNTS =", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsNotEqualTo(Long value) {
            addCriterion("CLOTH_CNTS <>", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsGreaterThan(Long value) {
            addCriterion("CLOTH_CNTS >", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("CLOTH_CNTS >=", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsLessThan(Long value) {
            addCriterion("CLOTH_CNTS <", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsLessThanOrEqualTo(Long value) {
            addCriterion("CLOTH_CNTS <=", value, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsIn(List<Long> values) {
            addCriterion("CLOTH_CNTS in", values, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsNotIn(List<Long> values) {
            addCriterion("CLOTH_CNTS not in", values, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsBetween(Long value1, Long value2) {
            addCriterion("CLOTH_CNTS between", value1, value2, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andClothCntsNotBetween(Long value1, Long value2) {
            addCriterion("CLOTH_CNTS not between", value1, value2, "clothCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsIsNull() {
            addCriterion("FOOD_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andFoodCntsIsNotNull() {
            addCriterion("FOOD_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCntsEqualTo(Long value) {
            addCriterion("FOOD_CNTS =", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsNotEqualTo(Long value) {
            addCriterion("FOOD_CNTS <>", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsGreaterThan(Long value) {
            addCriterion("FOOD_CNTS >", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("FOOD_CNTS >=", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsLessThan(Long value) {
            addCriterion("FOOD_CNTS <", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsLessThanOrEqualTo(Long value) {
            addCriterion("FOOD_CNTS <=", value, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsIn(List<Long> values) {
            addCriterion("FOOD_CNTS in", values, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsNotIn(List<Long> values) {
            addCriterion("FOOD_CNTS not in", values, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsBetween(Long value1, Long value2) {
            addCriterion("FOOD_CNTS between", value1, value2, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andFoodCntsNotBetween(Long value1, Long value2) {
            addCriterion("FOOD_CNTS not between", value1, value2, "foodCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsIsNull() {
            addCriterion("GAME_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andGameCntsIsNotNull() {
            addCriterion("GAME_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andGameCntsEqualTo(Long value) {
            addCriterion("GAME_CNTS =", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsNotEqualTo(Long value) {
            addCriterion("GAME_CNTS <>", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsGreaterThan(Long value) {
            addCriterion("GAME_CNTS >", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("GAME_CNTS >=", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsLessThan(Long value) {
            addCriterion("GAME_CNTS <", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsLessThanOrEqualTo(Long value) {
            addCriterion("GAME_CNTS <=", value, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsIn(List<Long> values) {
            addCriterion("GAME_CNTS in", values, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsNotIn(List<Long> values) {
            addCriterion("GAME_CNTS not in", values, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsBetween(Long value1, Long value2) {
            addCriterion("GAME_CNTS between", value1, value2, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andGameCntsNotBetween(Long value1, Long value2) {
            addCriterion("GAME_CNTS not between", value1, value2, "gameCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsIsNull() {
            addCriterion("OUTDOOR_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsIsNotNull() {
            addCriterion("OUTDOOR_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsEqualTo(Long value) {
            addCriterion("OUTDOOR_CNTS =", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsNotEqualTo(Long value) {
            addCriterion("OUTDOOR_CNTS <>", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsGreaterThan(Long value) {
            addCriterion("OUTDOOR_CNTS >", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("OUTDOOR_CNTS >=", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsLessThan(Long value) {
            addCriterion("OUTDOOR_CNTS <", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsLessThanOrEqualTo(Long value) {
            addCriterion("OUTDOOR_CNTS <=", value, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsIn(List<Long> values) {
            addCriterion("OUTDOOR_CNTS in", values, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsNotIn(List<Long> values) {
            addCriterion("OUTDOOR_CNTS not in", values, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsBetween(Long value1, Long value2) {
            addCriterion("OUTDOOR_CNTS between", value1, value2, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andOutdoorCntsNotBetween(Long value1, Long value2) {
            addCriterion("OUTDOOR_CNTS not between", value1, value2, "outdoorCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsIsNull() {
            addCriterion("HOMEELEC_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsIsNotNull() {
            addCriterion("HOMEELEC_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsEqualTo(Long value) {
            addCriterion("HOMEELEC_CNTS =", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsNotEqualTo(Long value) {
            addCriterion("HOMEELEC_CNTS <>", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsGreaterThan(Long value) {
            addCriterion("HOMEELEC_CNTS >", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("HOMEELEC_CNTS >=", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsLessThan(Long value) {
            addCriterion("HOMEELEC_CNTS <", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsLessThanOrEqualTo(Long value) {
            addCriterion("HOMEELEC_CNTS <=", value, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsIn(List<Long> values) {
            addCriterion("HOMEELEC_CNTS in", values, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsNotIn(List<Long> values) {
            addCriterion("HOMEELEC_CNTS not in", values, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsBetween(Long value1, Long value2) {
            addCriterion("HOMEELEC_CNTS between", value1, value2, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andHomeelecCntsNotBetween(Long value1, Long value2) {
            addCriterion("HOMEELEC_CNTS not between", value1, value2, "homeelecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsIsNull() {
            addCriterion("THREEC_CNTS is null");
            return (Criteria) this;
        }

        public Criteria andThreecCntsIsNotNull() {
            addCriterion("THREEC_CNTS is not null");
            return (Criteria) this;
        }

        public Criteria andThreecCntsEqualTo(Long value) {
            addCriterion("THREEC_CNTS =", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsNotEqualTo(Long value) {
            addCriterion("THREEC_CNTS <>", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsGreaterThan(Long value) {
            addCriterion("THREEC_CNTS >", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsGreaterThanOrEqualTo(Long value) {
            addCriterion("THREEC_CNTS >=", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsLessThan(Long value) {
            addCriterion("THREEC_CNTS <", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsLessThanOrEqualTo(Long value) {
            addCriterion("THREEC_CNTS <=", value, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsIn(List<Long> values) {
            addCriterion("THREEC_CNTS in", values, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsNotIn(List<Long> values) {
            addCriterion("THREEC_CNTS not in", values, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsBetween(Long value1, Long value2) {
            addCriterion("THREEC_CNTS between", value1, value2, "threecCnts");
            return (Criteria) this;
        }

        public Criteria andThreecCntsNotBetween(Long value1, Long value2) {
            addCriterion("THREEC_CNTS not between", value1, value2, "threecCnts");
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