package com.hnguigu.erp.entity;

import java.util.ArrayList;
import java.util.List;

public class TblRoleresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRoleresExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Long value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Long value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Long value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Long value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Long value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Long> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Long> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Long value1, Long value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Long value1, Long value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIsNull() {
            addCriterion("roleUuid is null");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIsNotNull() {
            addCriterion("roleUuid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleuuidEqualTo(Long value) {
            addCriterion("roleUuid =", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotEqualTo(Long value) {
            addCriterion("roleUuid <>", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidGreaterThan(Long value) {
            addCriterion("roleUuid >", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("roleUuid >=", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidLessThan(Long value) {
            addCriterion("roleUuid <", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidLessThanOrEqualTo(Long value) {
            addCriterion("roleUuid <=", value, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidIn(List<Long> values) {
            addCriterion("roleUuid in", values, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotIn(List<Long> values) {
            addCriterion("roleUuid not in", values, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidBetween(Long value1, Long value2) {
            addCriterion("roleUuid between", value1, value2, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andRoleuuidNotBetween(Long value1, Long value2) {
            addCriterion("roleUuid not between", value1, value2, "roleuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidIsNull() {
            addCriterion("resUuid is null");
            return (Criteria) this;
        }

        public Criteria andResuuidIsNotNull() {
            addCriterion("resUuid is not null");
            return (Criteria) this;
        }

        public Criteria andResuuidEqualTo(Long value) {
            addCriterion("resUuid =", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidNotEqualTo(Long value) {
            addCriterion("resUuid <>", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidGreaterThan(Long value) {
            addCriterion("resUuid >", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("resUuid >=", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidLessThan(Long value) {
            addCriterion("resUuid <", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidLessThanOrEqualTo(Long value) {
            addCriterion("resUuid <=", value, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidIn(List<Long> values) {
            addCriterion("resUuid in", values, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidNotIn(List<Long> values) {
            addCriterion("resUuid not in", values, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidBetween(Long value1, Long value2) {
            addCriterion("resUuid between", value1, value2, "resuuid");
            return (Criteria) this;
        }

        public Criteria andResuuidNotBetween(Long value1, Long value2) {
            addCriterion("resUuid not between", value1, value2, "resuuid");
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