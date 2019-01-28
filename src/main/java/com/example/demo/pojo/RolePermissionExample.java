package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class RolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolePermissionExample() {
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

        public Criteria andRolepermissionidIsNull() {
            addCriterion("rolePermissionId is null");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidIsNotNull() {
            addCriterion("rolePermissionId is not null");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidEqualTo(Integer value) {
            addCriterion("rolePermissionId =", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidNotEqualTo(Integer value) {
            addCriterion("rolePermissionId <>", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidGreaterThan(Integer value) {
            addCriterion("rolePermissionId >", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolePermissionId >=", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidLessThan(Integer value) {
            addCriterion("rolePermissionId <", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidLessThanOrEqualTo(Integer value) {
            addCriterion("rolePermissionId <=", value, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidIn(List<Integer> values) {
            addCriterion("rolePermissionId in", values, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidNotIn(List<Integer> values) {
            addCriterion("rolePermissionId not in", values, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidBetween(Integer value1, Integer value2) {
            addCriterion("rolePermissionId between", value1, value2, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRolepermissionidNotBetween(Integer value1, Integer value2) {
            addCriterion("rolePermissionId not between", value1, value2, "rolepermissionid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidIsNull() {
            addCriterion("psermissionId is null");
            return (Criteria) this;
        }

        public Criteria andPsermissionidIsNotNull() {
            addCriterion("psermissionId is not null");
            return (Criteria) this;
        }

        public Criteria andPsermissionidEqualTo(Integer value) {
            addCriterion("psermissionId =", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidNotEqualTo(Integer value) {
            addCriterion("psermissionId <>", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidGreaterThan(Integer value) {
            addCriterion("psermissionId >", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psermissionId >=", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidLessThan(Integer value) {
            addCriterion("psermissionId <", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidLessThanOrEqualTo(Integer value) {
            addCriterion("psermissionId <=", value, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidIn(List<Integer> values) {
            addCriterion("psermissionId in", values, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidNotIn(List<Integer> values) {
            addCriterion("psermissionId not in", values, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidBetween(Integer value1, Integer value2) {
            addCriterion("psermissionId between", value1, value2, "psermissionid");
            return (Criteria) this;
        }

        public Criteria andPsermissionidNotBetween(Integer value1, Integer value2) {
            addCriterion("psermissionId not between", value1, value2, "psermissionid");
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