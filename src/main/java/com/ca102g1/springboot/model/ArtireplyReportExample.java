package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class ArtireplyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtireplyReportExample() {
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

        public Criteria andArtireplyReportNoIsNull() {
            addCriterion("ARTIREPLY_REPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoIsNotNull() {
            addCriterion("ARTIREPLY_REPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoEqualTo(String value) {
            addCriterion("ARTIREPLY_REPORT_NO =", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoNotEqualTo(String value) {
            addCriterion("ARTIREPLY_REPORT_NO <>", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoGreaterThan(String value) {
            addCriterion("ARTIREPLY_REPORT_NO >", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("ARTIREPLY_REPORT_NO >=", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoLessThan(String value) {
            addCriterion("ARTIREPLY_REPORT_NO <", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoLessThanOrEqualTo(String value) {
            addCriterion("ARTIREPLY_REPORT_NO <=", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoLike(String value) {
            addCriterion("ARTIREPLY_REPORT_NO like", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoNotLike(String value) {
            addCriterion("ARTIREPLY_REPORT_NO not like", value, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoIn(List<String> values) {
            addCriterion("ARTIREPLY_REPORT_NO in", values, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoNotIn(List<String> values) {
            addCriterion("ARTIREPLY_REPORT_NO not in", values, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoBetween(String value1, String value2) {
            addCriterion("ARTIREPLY_REPORT_NO between", value1, value2, "artireplyReportNo");
            return (Criteria) this;
        }

        public Criteria andArtireplyReportNoNotBetween(String value1, String value2) {
            addCriterion("ARTIREPLY_REPORT_NO not between", value1, value2, "artireplyReportNo");
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

        public Criteria andEmpNoIsNull() {
            addCriterion("EMP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("EMP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("EMP_NO =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("EMP_NO <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("EMP_NO >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NO >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("EMP_NO <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("EMP_NO <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("EMP_NO like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("EMP_NO not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("EMP_NO in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("EMP_NO not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("EMP_NO between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("EMP_NO not between", value1, value2, "empNo");
            return (Criteria) this;
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

        public Criteria andRepNoEqualTo(Long value) {
            addCriterion("REP_NO =", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotEqualTo(Long value) {
            addCriterion("REP_NO <>", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoGreaterThan(Long value) {
            addCriterion("REP_NO >", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoGreaterThanOrEqualTo(Long value) {
            addCriterion("REP_NO >=", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoLessThan(Long value) {
            addCriterion("REP_NO <", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoLessThanOrEqualTo(Long value) {
            addCriterion("REP_NO <=", value, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoIn(List<Long> values) {
            addCriterion("REP_NO in", values, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotIn(List<Long> values) {
            addCriterion("REP_NO not in", values, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoBetween(Long value1, Long value2) {
            addCriterion("REP_NO between", value1, value2, "repNo");
            return (Criteria) this;
        }

        public Criteria andRepNoNotBetween(Long value1, Long value2) {
            addCriterion("REP_NO not between", value1, value2, "repNo");
            return (Criteria) this;
        }

        public Criteria andReportReasonsIsNull() {
            addCriterion("REPORT_REASONS is null");
            return (Criteria) this;
        }

        public Criteria andReportReasonsIsNotNull() {
            addCriterion("REPORT_REASONS is not null");
            return (Criteria) this;
        }

        public Criteria andReportReasonsEqualTo(String value) {
            addCriterion("REPORT_REASONS =", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsNotEqualTo(String value) {
            addCriterion("REPORT_REASONS <>", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsGreaterThan(String value) {
            addCriterion("REPORT_REASONS >", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_REASONS >=", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsLessThan(String value) {
            addCriterion("REPORT_REASONS <", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsLessThanOrEqualTo(String value) {
            addCriterion("REPORT_REASONS <=", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsLike(String value) {
            addCriterion("REPORT_REASONS like", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsNotLike(String value) {
            addCriterion("REPORT_REASONS not like", value, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsIn(List<String> values) {
            addCriterion("REPORT_REASONS in", values, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsNotIn(List<String> values) {
            addCriterion("REPORT_REASONS not in", values, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsBetween(String value1, String value2) {
            addCriterion("REPORT_REASONS between", value1, value2, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportReasonsNotBetween(String value1, String value2) {
            addCriterion("REPORT_REASONS not between", value1, value2, "reportReasons");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionIsNull() {
            addCriterion("REPORT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionIsNotNull() {
            addCriterion("REPORT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionEqualTo(String value) {
            addCriterion("REPORT_DESCRIPTION =", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionNotEqualTo(String value) {
            addCriterion("REPORT_DESCRIPTION <>", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionGreaterThan(String value) {
            addCriterion("REPORT_DESCRIPTION >", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DESCRIPTION >=", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionLessThan(String value) {
            addCriterion("REPORT_DESCRIPTION <", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DESCRIPTION <=", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionLike(String value) {
            addCriterion("REPORT_DESCRIPTION like", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionNotLike(String value) {
            addCriterion("REPORT_DESCRIPTION not like", value, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionIn(List<String> values) {
            addCriterion("REPORT_DESCRIPTION in", values, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionNotIn(List<String> values) {
            addCriterion("REPORT_DESCRIPTION not in", values, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionBetween(String value1, String value2) {
            addCriterion("REPORT_DESCRIPTION between", value1, value2, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportDescriptionNotBetween(String value1, String value2) {
            addCriterion("REPORT_DESCRIPTION not between", value1, value2, "reportDescription");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(Short value) {
            addCriterion("REPORT_STATUS =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Short value) {
            addCriterion("REPORT_STATUS <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Short value) {
            addCriterion("REPORT_STATUS >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("REPORT_STATUS >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Short value) {
            addCriterion("REPORT_STATUS <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Short value) {
            addCriterion("REPORT_STATUS <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Short> values) {
            addCriterion("REPORT_STATUS in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Short> values) {
            addCriterion("REPORT_STATUS not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Short value1, Short value2) {
            addCriterion("REPORT_STATUS between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Short value1, Short value2) {
            addCriterion("REPORT_STATUS not between", value1, value2, "reportStatus");
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