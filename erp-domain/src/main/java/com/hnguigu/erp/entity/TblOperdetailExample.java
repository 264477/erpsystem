package com.hnguigu.erp.entity;

import java.util.ArrayList;
import java.util.List;

public class TblOperdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOperdetailExample() {
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

        public Criteria andEmpuuidIsNull() {
            addCriterion("empUuid is null");
            return (Criteria) this;
        }

        public Criteria andEmpuuidIsNotNull() {
            addCriterion("empUuid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpuuidEqualTo(Long value) {
            addCriterion("empUuid =", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotEqualTo(Long value) {
            addCriterion("empUuid <>", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidGreaterThan(Long value) {
            addCriterion("empUuid >", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("empUuid >=", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidLessThan(Long value) {
            addCriterion("empUuid <", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidLessThanOrEqualTo(Long value) {
            addCriterion("empUuid <=", value, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidIn(List<Long> values) {
            addCriterion("empUuid in", values, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotIn(List<Long> values) {
            addCriterion("empUuid not in", values, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidBetween(Long value1, Long value2) {
            addCriterion("empUuid between", value1, value2, "empuuid");
            return (Criteria) this;
        }

        public Criteria andEmpuuidNotBetween(Long value1, Long value2) {
            addCriterion("empUuid not between", value1, value2, "empuuid");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNull() {
            addCriterion("operTime is null");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNotNull() {
            addCriterion("operTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpertimeEqualTo(Long value) {
            addCriterion("operTime =", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotEqualTo(Long value) {
            addCriterion("operTime <>", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThan(Long value) {
            addCriterion("operTime >", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThanOrEqualTo(Long value) {
            addCriterion("operTime >=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThan(Long value) {
            addCriterion("operTime <", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThanOrEqualTo(Long value) {
            addCriterion("operTime <=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeIn(List<Long> values) {
            addCriterion("operTime in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotIn(List<Long> values) {
            addCriterion("operTime not in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeBetween(Long value1, Long value2) {
            addCriterion("operTime between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotBetween(Long value1, Long value2) {
            addCriterion("operTime not between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNull() {
            addCriterion("goodsUuid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNotNull() {
            addCriterion("goodsUuid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidEqualTo(Long value) {
            addCriterion("goodsUuid =", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotEqualTo(Long value) {
            addCriterion("goodsUuid <>", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThan(Long value) {
            addCriterion("goodsUuid >", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsUuid >=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThan(Long value) {
            addCriterion("goodsUuid <", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThanOrEqualTo(Long value) {
            addCriterion("goodsUuid <=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIn(List<Long> values) {
            addCriterion("goodsUuid in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotIn(List<Long> values) {
            addCriterion("goodsUuid not in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidBetween(Long value1, Long value2) {
            addCriterion("goodsUuid between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotBetween(Long value1, Long value2) {
            addCriterion("goodsUuid not between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNull() {
            addCriterion("storeUuid is null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNotNull() {
            addCriterion("storeUuid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidEqualTo(Long value) {
            addCriterion("storeUuid =", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotEqualTo(Long value) {
            addCriterion("storeUuid <>", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThan(Long value) {
            addCriterion("storeUuid >", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("storeUuid >=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThan(Long value) {
            addCriterion("storeUuid <", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThanOrEqualTo(Long value) {
            addCriterion("storeUuid <=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIn(List<Long> values) {
            addCriterion("storeUuid in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotIn(List<Long> values) {
            addCriterion("storeUuid not in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidBetween(Long value1, Long value2) {
            addCriterion("storeUuid between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotBetween(Long value1, Long value2) {
            addCriterion("storeUuid not between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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