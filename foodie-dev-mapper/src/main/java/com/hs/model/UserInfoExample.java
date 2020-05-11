package com.hs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
*UserInfoExample
* @author hs
* @since 2020/04/19
*/
public class UserInfoExample {
    /**
    *orderByClause
    */
    protected String orderByClause;

    /**
    *distinct
    */
    protected boolean distinct;

    /**
    *oredCriteria
    */
    protected List<Criteria> oredCriteria;

    /**
    *limit
    */
    private Integer limit;

    /**
    *offset
    */
    private Long offset;

    /**
    * UserInfoExample
    */
    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
    * setOrderByClause
    * @param orderByClause orderByClause
    */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
    * getOrderByClause
    * @return String String
    */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
    * setDistinct
    * @param distinct distinct
    */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
    * isDistinct
    * @return boolean boolean
    */
    public boolean isDistinct() {
        return distinct;
    }

    /**
    * getOredCriteria
    * @return List<Criteria> List<Criteria>
    */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
    * or
    * @param criteria criteria
    */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
    * or
    * @return Criteria Criteria
    */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
    * createCriteria
    * @return Criteria Criteria
    */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
    * createCriteriaInternal
    * @return Criteria Criteria
    */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
    * clear
    */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
    * setLimit
    * @param limit limit
    */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
    * getLimit
    * @return Integer Integer
    */
    public Integer getLimit() {
        return limit;
    }

    /**
    * setOffset
    * @param offset offset
    */
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
    * getOffset
    * @return Long Long
    */
    public Long getOffset() {
        return offset;
    }

    /**
    *AbstractGeneratedCriteria
    * @author hs
    * @since 2020/04/19
    */
    protected abstract static class AbstractGeneratedCriteria {
        /**
        *criteria
        */
        protected List<Criterion> criteria;

        /**
        * AbstractGeneratedCriteria
        */
        protected AbstractGeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
        * isValid
        * @return boolean boolean
        */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
        * getAllCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
        * getCriteria
        * @return List<Criterion> List<Criterion>
        */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
        * addCriterion
        * @param condition condition
        */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value value
        * @param property property
        */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
        * addCriterion
        * @param condition condition
        * @param value1 value1
        * @param value2 value2
        * @param property property
        */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
        * andIdIsNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        /**
        * andIdIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        /**
        * andIdEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        /**
        * andIdIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        /**
        * andIdBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andIdNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
        * andUsernameIsNull
        * @return Criteria Criteria
        */
        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        /**
        * andUsernameIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        /**
        * andUsernameEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameNotLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        /**
        * andUsernameNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        /**
        * andPasswordIsNull
        * @return Criteria Criteria
        */
        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        /**
        * andPasswordIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        /**
        * andPasswordEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
        * andPasswordNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
        * andOpenidIsNull
        * @return Criteria Criteria
        */
        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        /**
        * andOpenidIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        /**
        * andOpenidEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidNotLike
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        /**
        * andOpenidNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        /**
        * andRoleIsNull
        * @return Criteria Criteria
        */
        public Criteria andRoleIsNull() {
            addCriterion("`role` is null");
            return (Criteria) this;
        }

        /**
        * andRoleIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andRoleIsNotNull() {
            addCriterion("`role` is not null");
            return (Criteria) this;
        }

        /**
        * andRoleEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleEqualTo(Boolean value) {
            addCriterion("`role` =", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleNotEqualTo(Boolean value) {
            addCriterion("`role` <>", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleGreaterThan(Boolean value) {
            addCriterion("`role` >", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`role` >=", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleLessThan(Boolean value) {
            addCriterion("`role` <", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andRoleLessThanOrEqualTo(Boolean value) {
            addCriterion("`role` <=", value, "role");
            return (Criteria) this;
        }

        /**
        * andRoleIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andRoleIn(List<Boolean> values) {
            addCriterion("`role` in", values, "role");
            return (Criteria) this;
        }

        /**
        * andRoleNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andRoleNotIn(List<Boolean> values) {
            addCriterion("`role` not in", values, "role");
            return (Criteria) this;
        }

        /**
        * andRoleBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andRoleBetween(Boolean value1, Boolean value2) {
            addCriterion("`role` between", value1, value2, "role");
            return (Criteria) this;
        }

        /**
        * andRoleNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andRoleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`role` not between", value1, value2, "role");
            return (Criteria) this;
        }

        /**
        * andCreateTimeIsNull
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        /**
        * andCreateTimeIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        /**
        * andCreateTimeEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
        * andCreateTimeNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeIsNull
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeIsNotNull
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeNotEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeGreaterThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeGreaterThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeLessThan
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeLessThanOrEqualTo
        * @param value value
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeNotIn
        * @param values values
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        /**
        * andUpdateTimeNotBetween
        * @param value1 value1
        * @param value2 value2
        * @return Criteria Criteria
        */
        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
    *Criteria
    * @author hs
    * @since 2020/04/19
    */
    public static class Criteria extends AbstractGeneratedCriteria {

        /**
        * Criteria
        */
        protected Criteria() {
            super();
        }
    }

    /**
    *Criterion
    * @author hs
    * @since 2020/04/19
    */
    public static class Criterion {
        /**
        *condition
        */
        private String condition;

        /**
        *value
        */
        private Object value;

        /**
        *secondValue
        */
        private Object secondValue;

        /**
        *noValue
        */
        private boolean noValue;

        /**
        *singleValue
        */
        private boolean singleValue;

        /**
        *betweenValue
        */
        private boolean betweenValue;

        /**
        *listValue
        */
        private boolean listValue;

        /**
        *typeHandler
        */
        private String typeHandler;

        /**
        * getCondition
        * @return String String
        */
        public String getCondition() {
            return condition;
        }

        /**
        * getValue
        * @return Object Object
        */
        public Object getValue() {
            return value;
        }

        /**
        * getSecondValue
        * @return Object Object
        */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
        * isNoValue
        * @return boolean boolean
        */
        public boolean isNoValue() {
            return noValue;
        }

        /**
        * isSingleValue
        * @return boolean boolean
        */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
        * isBetweenValue
        * @return boolean boolean
        */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
        * isListValue
        * @return boolean boolean
        */
        public boolean isListValue() {
            return listValue;
        }

        /**
        * getTypeHandler
        * @return String String
        */
        public String getTypeHandler() {
            return typeHandler;
        }

        /**
        * Criterion
        * @param condition condition
        */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param typeHandler typeHandler
        */
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

        /**
        * Criterion
        * @param condition condition
        * @param value value
        */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        * @param typeHandler typeHandler
        */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
        * Criterion
        * @param condition condition
        * @param value value
        * @param secondValue secondValue
        */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}