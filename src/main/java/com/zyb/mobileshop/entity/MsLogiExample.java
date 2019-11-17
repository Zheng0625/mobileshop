package com.zyb.mobileshop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsLogiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MsLogiExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andLogiIdIsNull() {
            addCriterion("logi_id is null");
            return (Criteria) this;
        }

        public Criteria andLogiIdIsNotNull() {
            addCriterion("logi_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogiIdEqualTo(Integer value) {
            addCriterion("logi_id =", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdNotEqualTo(Integer value) {
            addCriterion("logi_id <>", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdGreaterThan(Integer value) {
            addCriterion("logi_id >", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logi_id >=", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdLessThan(Integer value) {
            addCriterion("logi_id <", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdLessThanOrEqualTo(Integer value) {
            addCriterion("logi_id <=", value, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdIn(List<Integer> values) {
            addCriterion("logi_id in", values, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdNotIn(List<Integer> values) {
            addCriterion("logi_id not in", values, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdBetween(Integer value1, Integer value2) {
            addCriterion("logi_id between", value1, value2, "logiId");
            return (Criteria) this;
        }

        public Criteria andLogiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logi_id not between", value1, value2, "logiId");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(BigDecimal value) {
            addCriterion("carriage =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(BigDecimal value) {
            addCriterion("carriage <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(BigDecimal value) {
            addCriterion("carriage >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("carriage >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(BigDecimal value) {
            addCriterion("carriage <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("carriage <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<BigDecimal> values) {
            addCriterion("carriage in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<BigDecimal> values) {
            addCriterion("carriage not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carriage between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carriage not between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatimeIsNull() {
            addCriterion("creatime is null");
            return (Criteria) this;
        }

        public Criteria andCreatimeIsNotNull() {
            addCriterion("creatime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatimeEqualTo(Date value) {
            addCriterion("creatime =", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotEqualTo(Date value) {
            addCriterion("creatime <>", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThan(Date value) {
            addCriterion("creatime >", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatime >=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThan(Date value) {
            addCriterion("creatime <", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThanOrEqualTo(Date value) {
            addCriterion("creatime <=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeIn(List<Date> values) {
            addCriterion("creatime in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotIn(List<Date> values) {
            addCriterion("creatime not in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeBetween(Date value1, Date value2) {
            addCriterion("creatime between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotBetween(Date value1, Date value2) {
            addCriterion("creatime not between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }
    }

    /**
     */
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