package com.ai.ch.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class CtScoreKpiCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CtScoreKpiCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andKpiIdIsNull() {
            addCriterion("KPI_ID is null");
            return (Criteria) this;
        }

        public Criteria andKpiIdIsNotNull() {
            addCriterion("KPI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKpiIdEqualTo(Integer value) {
            addCriterion("KPI_ID =", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotEqualTo(Integer value) {
            addCriterion("KPI_ID <>", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThan(Integer value) {
            addCriterion("KPI_ID >", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("KPI_ID >=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThan(Integer value) {
            addCriterion("KPI_ID <", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdLessThanOrEqualTo(Integer value) {
            addCriterion("KPI_ID <=", value, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdIn(List<Integer> values) {
            addCriterion("KPI_ID in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotIn(List<Integer> values) {
            addCriterion("KPI_ID not in", values, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdBetween(Integer value1, Integer value2) {
            addCriterion("KPI_ID between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("KPI_ID not between", value1, value2, "kpiId");
            return (Criteria) this;
        }

        public Criteria andKpiNameIsNull() {
            addCriterion("KPI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKpiNameIsNotNull() {
            addCriterion("KPI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKpiNameEqualTo(String value) {
            addCriterion("KPI_NAME =", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameNotEqualTo(String value) {
            addCriterion("KPI_NAME <>", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameGreaterThan(String value) {
            addCriterion("KPI_NAME >", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_NAME >=", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameLessThan(String value) {
            addCriterion("KPI_NAME <", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameLessThanOrEqualTo(String value) {
            addCriterion("KPI_NAME <=", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameLike(String value) {
            addCriterion("KPI_NAME like", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameNotLike(String value) {
            addCriterion("KPI_NAME not like", value, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameIn(List<String> values) {
            addCriterion("KPI_NAME in", values, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameNotIn(List<String> values) {
            addCriterion("KPI_NAME not in", values, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameBetween(String value1, String value2) {
            addCriterion("KPI_NAME between", value1, value2, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiNameNotBetween(String value1, String value2) {
            addCriterion("KPI_NAME not between", value1, value2, "kpiName");
            return (Criteria) this;
        }

        public Criteria andKpiDescIsNull() {
            addCriterion("KPI_DESC is null");
            return (Criteria) this;
        }

        public Criteria andKpiDescIsNotNull() {
            addCriterion("KPI_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andKpiDescEqualTo(String value) {
            addCriterion("KPI_DESC =", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescNotEqualTo(String value) {
            addCriterion("KPI_DESC <>", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescGreaterThan(String value) {
            addCriterion("KPI_DESC >", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescGreaterThanOrEqualTo(String value) {
            addCriterion("KPI_DESC >=", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescLessThan(String value) {
            addCriterion("KPI_DESC <", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescLessThanOrEqualTo(String value) {
            addCriterion("KPI_DESC <=", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescLike(String value) {
            addCriterion("KPI_DESC like", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescNotLike(String value) {
            addCriterion("KPI_DESC not like", value, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescIn(List<String> values) {
            addCriterion("KPI_DESC in", values, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescNotIn(List<String> values) {
            addCriterion("KPI_DESC not in", values, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescBetween(String value1, String value2) {
            addCriterion("KPI_DESC between", value1, value2, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andKpiDescNotBetween(String value1, String value2) {
            addCriterion("KPI_DESC not between", value1, value2, "kpiDesc");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNull() {
            addCriterion("MIN_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNotNull() {
            addCriterion("MIN_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMinScoreEqualTo(Integer value) {
            addCriterion("MIN_SCORE =", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotEqualTo(Integer value) {
            addCriterion("MIN_SCORE <>", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThan(Integer value) {
            addCriterion("MIN_SCORE >", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_SCORE >=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThan(Integer value) {
            addCriterion("MIN_SCORE <", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_SCORE <=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreIn(List<Integer> values) {
            addCriterion("MIN_SCORE in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotIn(List<Integer> values) {
            addCriterion("MIN_SCORE not in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreBetween(Integer value1, Integer value2) {
            addCriterion("MIN_SCORE between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_SCORE not between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNull() {
            addCriterion("MAX_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNotNull() {
            addCriterion("MAX_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreEqualTo(Integer value) {
            addCriterion("MAX_SCORE =", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotEqualTo(Integer value) {
            addCriterion("MAX_SCORE <>", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThan(Integer value) {
            addCriterion("MAX_SCORE >", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_SCORE >=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThan(Integer value) {
            addCriterion("MAX_SCORE <", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_SCORE <=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIn(List<Integer> values) {
            addCriterion("MAX_SCORE in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotIn(List<Integer> values) {
            addCriterion("MAX_SCORE not in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreBetween(Integer value1, Integer value2) {
            addCriterion("MAX_SCORE between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_SCORE not between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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