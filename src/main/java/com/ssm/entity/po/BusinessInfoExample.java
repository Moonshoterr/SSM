package com.ssm.entity.po;

import java.util.ArrayList;
import java.util.List;

public class BusinessInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date_ is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date_ is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date_ =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date_ <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date_ >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date_ >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date_ <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date_ <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date_ like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date_ not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date_ in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date_ not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date_ between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date_ not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name_ is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name_ is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name_ =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name_ <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name_ >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name_ >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name_ <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name_ <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name_ like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name_ not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name_ in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name_ not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name_ between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name_ not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andPreLeftIsNull() {
            addCriterion("pre_left_ is null");
            return (Criteria) this;
        }

        public Criteria andPreLeftIsNotNull() {
            addCriterion("pre_left_ is not null");
            return (Criteria) this;
        }

        public Criteria andPreLeftEqualTo(String value) {
            addCriterion("pre_left_ =", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftNotEqualTo(String value) {
            addCriterion("pre_left_ <>", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftGreaterThan(String value) {
            addCriterion("pre_left_ >", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftGreaterThanOrEqualTo(String value) {
            addCriterion("pre_left_ >=", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftLessThan(String value) {
            addCriterion("pre_left_ <", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftLessThanOrEqualTo(String value) {
            addCriterion("pre_left_ <=", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftLike(String value) {
            addCriterion("pre_left_ like", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftNotLike(String value) {
            addCriterion("pre_left_ not like", value, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftIn(List<String> values) {
            addCriterion("pre_left_ in", values, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftNotIn(List<String> values) {
            addCriterion("pre_left_ not in", values, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftBetween(String value1, String value2) {
            addCriterion("pre_left_ between", value1, value2, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreLeftNotBetween(String value1, String value2) {
            addCriterion("pre_left_ not between", value1, value2, "preLeft");
            return (Criteria) this;
        }

        public Criteria andPreRightIsNull() {
            addCriterion("pre_right_ is null");
            return (Criteria) this;
        }

        public Criteria andPreRightIsNotNull() {
            addCriterion("pre_right_ is not null");
            return (Criteria) this;
        }

        public Criteria andPreRightEqualTo(String value) {
            addCriterion("pre_right_ =", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightNotEqualTo(String value) {
            addCriterion("pre_right_ <>", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightGreaterThan(String value) {
            addCriterion("pre_right_ >", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightGreaterThanOrEqualTo(String value) {
            addCriterion("pre_right_ >=", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightLessThan(String value) {
            addCriterion("pre_right_ <", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightLessThanOrEqualTo(String value) {
            addCriterion("pre_right_ <=", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightLike(String value) {
            addCriterion("pre_right_ like", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightNotLike(String value) {
            addCriterion("pre_right_ not like", value, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightIn(List<String> values) {
            addCriterion("pre_right_ in", values, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightNotIn(List<String> values) {
            addCriterion("pre_right_ not in", values, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightBetween(String value1, String value2) {
            addCriterion("pre_right_ between", value1, value2, "preRight");
            return (Criteria) this;
        }

        public Criteria andPreRightNotBetween(String value1, String value2) {
            addCriterion("pre_right_ not between", value1, value2, "preRight");
            return (Criteria) this;
        }

        public Criteria andPostLeftIsNull() {
            addCriterion("post_left_ is null");
            return (Criteria) this;
        }

        public Criteria andPostLeftIsNotNull() {
            addCriterion("post_left_ is not null");
            return (Criteria) this;
        }

        public Criteria andPostLeftEqualTo(String value) {
            addCriterion("post_left_ =", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftNotEqualTo(String value) {
            addCriterion("post_left_ <>", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftGreaterThan(String value) {
            addCriterion("post_left_ >", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftGreaterThanOrEqualTo(String value) {
            addCriterion("post_left_ >=", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftLessThan(String value) {
            addCriterion("post_left_ <", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftLessThanOrEqualTo(String value) {
            addCriterion("post_left_ <=", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftLike(String value) {
            addCriterion("post_left_ like", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftNotLike(String value) {
            addCriterion("post_left_ not like", value, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftIn(List<String> values) {
            addCriterion("post_left_ in", values, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftNotIn(List<String> values) {
            addCriterion("post_left_ not in", values, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftBetween(String value1, String value2) {
            addCriterion("post_left_ between", value1, value2, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostLeftNotBetween(String value1, String value2) {
            addCriterion("post_left_ not between", value1, value2, "postLeft");
            return (Criteria) this;
        }

        public Criteria andPostRightIsNull() {
            addCriterion("post_right_ is null");
            return (Criteria) this;
        }

        public Criteria andPostRightIsNotNull() {
            addCriterion("post_right_ is not null");
            return (Criteria) this;
        }

        public Criteria andPostRightEqualTo(String value) {
            addCriterion("post_right_ =", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightNotEqualTo(String value) {
            addCriterion("post_right_ <>", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightGreaterThan(String value) {
            addCriterion("post_right_ >", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightGreaterThanOrEqualTo(String value) {
            addCriterion("post_right_ >=", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightLessThan(String value) {
            addCriterion("post_right_ <", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightLessThanOrEqualTo(String value) {
            addCriterion("post_right_ <=", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightLike(String value) {
            addCriterion("post_right_ like", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightNotLike(String value) {
            addCriterion("post_right_ not like", value, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightIn(List<String> values) {
            addCriterion("post_right_ in", values, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightNotIn(List<String> values) {
            addCriterion("post_right_ not in", values, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightBetween(String value1, String value2) {
            addCriterion("post_right_ between", value1, value2, "postRight");
            return (Criteria) this;
        }

        public Criteria andPostRightNotBetween(String value1, String value2) {
            addCriterion("post_right_ not between", value1, value2, "postRight");
            return (Criteria) this;
        }

        public Criteria andQiuLeftIsNull() {
            addCriterion("qiu_left_ is null");
            return (Criteria) this;
        }

        public Criteria andQiuLeftIsNotNull() {
            addCriterion("qiu_left_ is not null");
            return (Criteria) this;
        }

        public Criteria andQiuLeftEqualTo(String value) {
            addCriterion("qiu_left_ =", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftNotEqualTo(String value) {
            addCriterion("qiu_left_ <>", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftGreaterThan(String value) {
            addCriterion("qiu_left_ >", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftGreaterThanOrEqualTo(String value) {
            addCriterion("qiu_left_ >=", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftLessThan(String value) {
            addCriterion("qiu_left_ <", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftLessThanOrEqualTo(String value) {
            addCriterion("qiu_left_ <=", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftLike(String value) {
            addCriterion("qiu_left_ like", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftNotLike(String value) {
            addCriterion("qiu_left_ not like", value, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftIn(List<String> values) {
            addCriterion("qiu_left_ in", values, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftNotIn(List<String> values) {
            addCriterion("qiu_left_ not in", values, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftBetween(String value1, String value2) {
            addCriterion("qiu_left_ between", value1, value2, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andQiuLeftNotBetween(String value1, String value2) {
            addCriterion("qiu_left_ not between", value1, value2, "qiuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftIsNull() {
            addCriterion("zhu_left_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuLeftIsNotNull() {
            addCriterion("zhu_left_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuLeftEqualTo(String value) {
            addCriterion("zhu_left_ =", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftNotEqualTo(String value) {
            addCriterion("zhu_left_ <>", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftGreaterThan(String value) {
            addCriterion("zhu_left_ >", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftGreaterThanOrEqualTo(String value) {
            addCriterion("zhu_left_ >=", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftLessThan(String value) {
            addCriterion("zhu_left_ <", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftLessThanOrEqualTo(String value) {
            addCriterion("zhu_left_ <=", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftLike(String value) {
            addCriterion("zhu_left_ like", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftNotLike(String value) {
            addCriterion("zhu_left_ not like", value, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftIn(List<String> values) {
            addCriterion("zhu_left_ in", values, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftNotIn(List<String> values) {
            addCriterion("zhu_left_ not in", values, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftBetween(String value1, String value2) {
            addCriterion("zhu_left_ between", value1, value2, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhuLeftNotBetween(String value1, String value2) {
            addCriterion("zhu_left_ not between", value1, value2, "zhuLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftIsNull() {
            addCriterion("zhou_left_ is null");
            return (Criteria) this;
        }

        public Criteria andZhouLeftIsNotNull() {
            addCriterion("zhou_left_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhouLeftEqualTo(String value) {
            addCriterion("zhou_left_ =", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftNotEqualTo(String value) {
            addCriterion("zhou_left_ <>", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftGreaterThan(String value) {
            addCriterion("zhou_left_ >", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftGreaterThanOrEqualTo(String value) {
            addCriterion("zhou_left_ >=", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftLessThan(String value) {
            addCriterion("zhou_left_ <", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftLessThanOrEqualTo(String value) {
            addCriterion("zhou_left_ <=", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftLike(String value) {
            addCriterion("zhou_left_ like", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftNotLike(String value) {
            addCriterion("zhou_left_ not like", value, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftIn(List<String> values) {
            addCriterion("zhou_left_ in", values, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftNotIn(List<String> values) {
            addCriterion("zhou_left_ not in", values, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftBetween(String value1, String value2) {
            addCriterion("zhou_left_ between", value1, value2, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andZhouLeftNotBetween(String value1, String value2) {
            addCriterion("zhou_left_ not between", value1, value2, "zhouLeft");
            return (Criteria) this;
        }

        public Criteria andQiuRightIsNull() {
            addCriterion("qiu_right_ is null");
            return (Criteria) this;
        }

        public Criteria andQiuRightIsNotNull() {
            addCriterion("qiu_right_ is not null");
            return (Criteria) this;
        }

        public Criteria andQiuRightEqualTo(String value) {
            addCriterion("qiu_right_ =", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightNotEqualTo(String value) {
            addCriterion("qiu_right_ <>", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightGreaterThan(String value) {
            addCriterion("qiu_right_ >", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightGreaterThanOrEqualTo(String value) {
            addCriterion("qiu_right_ >=", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightLessThan(String value) {
            addCriterion("qiu_right_ <", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightLessThanOrEqualTo(String value) {
            addCriterion("qiu_right_ <=", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightLike(String value) {
            addCriterion("qiu_right_ like", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightNotLike(String value) {
            addCriterion("qiu_right_ not like", value, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightIn(List<String> values) {
            addCriterion("qiu_right_ in", values, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightNotIn(List<String> values) {
            addCriterion("qiu_right_ not in", values, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightBetween(String value1, String value2) {
            addCriterion("qiu_right_ between", value1, value2, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andQiuRightNotBetween(String value1, String value2) {
            addCriterion("qiu_right_ not between", value1, value2, "qiuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightIsNull() {
            addCriterion("zhu_right_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuRightIsNotNull() {
            addCriterion("zhu_right_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuRightEqualTo(String value) {
            addCriterion("zhu_right_ =", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightNotEqualTo(String value) {
            addCriterion("zhu_right_ <>", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightGreaterThan(String value) {
            addCriterion("zhu_right_ >", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightGreaterThanOrEqualTo(String value) {
            addCriterion("zhu_right_ >=", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightLessThan(String value) {
            addCriterion("zhu_right_ <", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightLessThanOrEqualTo(String value) {
            addCriterion("zhu_right_ <=", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightLike(String value) {
            addCriterion("zhu_right_ like", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightNotLike(String value) {
            addCriterion("zhu_right_ not like", value, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightIn(List<String> values) {
            addCriterion("zhu_right_ in", values, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightNotIn(List<String> values) {
            addCriterion("zhu_right_ not in", values, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightBetween(String value1, String value2) {
            addCriterion("zhu_right_ between", value1, value2, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhuRightNotBetween(String value1, String value2) {
            addCriterion("zhu_right_ not between", value1, value2, "zhuRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightIsNull() {
            addCriterion("zhou_right_ is null");
            return (Criteria) this;
        }

        public Criteria andZhouRightIsNotNull() {
            addCriterion("zhou_right_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhouRightEqualTo(String value) {
            addCriterion("zhou_right_ =", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightNotEqualTo(String value) {
            addCriterion("zhou_right_ <>", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightGreaterThan(String value) {
            addCriterion("zhou_right_ >", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightGreaterThanOrEqualTo(String value) {
            addCriterion("zhou_right_ >=", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightLessThan(String value) {
            addCriterion("zhou_right_ <", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightLessThanOrEqualTo(String value) {
            addCriterion("zhou_right_ <=", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightLike(String value) {
            addCriterion("zhou_right_ like", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightNotLike(String value) {
            addCriterion("zhou_right_ not like", value, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightIn(List<String> values) {
            addCriterion("zhou_right_ in", values, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightNotIn(List<String> values) {
            addCriterion("zhou_right_ not in", values, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightBetween(String value1, String value2) {
            addCriterion("zhou_right_ between", value1, value2, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andZhouRightNotBetween(String value1, String value2) {
            addCriterion("zhou_right_ not between", value1, value2, "zhouRight");
            return (Criteria) this;
        }

        public Criteria andTongJuIsNull() {
            addCriterion("tong_ju_ is null");
            return (Criteria) this;
        }

        public Criteria andTongJuIsNotNull() {
            addCriterion("tong_ju_ is not null");
            return (Criteria) this;
        }

        public Criteria andTongJuEqualTo(String value) {
            addCriterion("tong_ju_ =", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuNotEqualTo(String value) {
            addCriterion("tong_ju_ <>", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuGreaterThan(String value) {
            addCriterion("tong_ju_ >", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuGreaterThanOrEqualTo(String value) {
            addCriterion("tong_ju_ >=", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuLessThan(String value) {
            addCriterion("tong_ju_ <", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuLessThanOrEqualTo(String value) {
            addCriterion("tong_ju_ <=", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuLike(String value) {
            addCriterion("tong_ju_ like", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuNotLike(String value) {
            addCriterion("tong_ju_ not like", value, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuIn(List<String> values) {
            addCriterion("tong_ju_ in", values, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuNotIn(List<String> values) {
            addCriterion("tong_ju_ not in", values, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuBetween(String value1, String value2) {
            addCriterion("tong_ju_ between", value1, value2, "tongJu");
            return (Criteria) this;
        }

        public Criteria andTongJuNotBetween(String value1, String value2) {
            addCriterion("tong_ju_ not between", value1, value2, "tongJu");
            return (Criteria) this;
        }

        public Criteria andFrameNameIsNull() {
            addCriterion("frame_name_ is null");
            return (Criteria) this;
        }

        public Criteria andFrameNameIsNotNull() {
            addCriterion("frame_name_ is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNameEqualTo(String value) {
            addCriterion("frame_name_ =", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameNotEqualTo(String value) {
            addCriterion("frame_name_ <>", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameGreaterThan(String value) {
            addCriterion("frame_name_ >", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameGreaterThanOrEqualTo(String value) {
            addCriterion("frame_name_ >=", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameLessThan(String value) {
            addCriterion("frame_name_ <", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameLessThanOrEqualTo(String value) {
            addCriterion("frame_name_ <=", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameLike(String value) {
            addCriterion("frame_name_ like", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameNotLike(String value) {
            addCriterion("frame_name_ not like", value, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameIn(List<String> values) {
            addCriterion("frame_name_ in", values, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameNotIn(List<String> values) {
            addCriterion("frame_name_ not in", values, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameBetween(String value1, String value2) {
            addCriterion("frame_name_ between", value1, value2, "frameName");
            return (Criteria) this;
        }

        public Criteria andFrameNameNotBetween(String value1, String value2) {
            addCriterion("frame_name_ not between", value1, value2, "frameName");
            return (Criteria) this;
        }

        public Criteria andFramePriceIsNull() {
            addCriterion("frame_price_ is null");
            return (Criteria) this;
        }

        public Criteria andFramePriceIsNotNull() {
            addCriterion("frame_price_ is not null");
            return (Criteria) this;
        }

        public Criteria andFramePriceEqualTo(String value) {
            addCriterion("frame_price_ =", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceNotEqualTo(String value) {
            addCriterion("frame_price_ <>", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceGreaterThan(String value) {
            addCriterion("frame_price_ >", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceGreaterThanOrEqualTo(String value) {
            addCriterion("frame_price_ >=", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceLessThan(String value) {
            addCriterion("frame_price_ <", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceLessThanOrEqualTo(String value) {
            addCriterion("frame_price_ <=", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceLike(String value) {
            addCriterion("frame_price_ like", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceNotLike(String value) {
            addCriterion("frame_price_ not like", value, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceIn(List<String> values) {
            addCriterion("frame_price_ in", values, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceNotIn(List<String> values) {
            addCriterion("frame_price_ not in", values, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceBetween(String value1, String value2) {
            addCriterion("frame_price_ between", value1, value2, "framePrice");
            return (Criteria) this;
        }

        public Criteria andFramePriceNotBetween(String value1, String value2) {
            addCriterion("frame_price_ not between", value1, value2, "framePrice");
            return (Criteria) this;
        }

        public Criteria andGlassNameIsNull() {
            addCriterion("glass_name_ is null");
            return (Criteria) this;
        }

        public Criteria andGlassNameIsNotNull() {
            addCriterion("glass_name_ is not null");
            return (Criteria) this;
        }

        public Criteria andGlassNameEqualTo(String value) {
            addCriterion("glass_name_ =", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameNotEqualTo(String value) {
            addCriterion("glass_name_ <>", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameGreaterThan(String value) {
            addCriterion("glass_name_ >", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameGreaterThanOrEqualTo(String value) {
            addCriterion("glass_name_ >=", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameLessThan(String value) {
            addCriterion("glass_name_ <", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameLessThanOrEqualTo(String value) {
            addCriterion("glass_name_ <=", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameLike(String value) {
            addCriterion("glass_name_ like", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameNotLike(String value) {
            addCriterion("glass_name_ not like", value, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameIn(List<String> values) {
            addCriterion("glass_name_ in", values, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameNotIn(List<String> values) {
            addCriterion("glass_name_ not in", values, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameBetween(String value1, String value2) {
            addCriterion("glass_name_ between", value1, value2, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassNameNotBetween(String value1, String value2) {
            addCriterion("glass_name_ not between", value1, value2, "glassName");
            return (Criteria) this;
        }

        public Criteria andGlassPriceIsNull() {
            addCriterion("glass_price_ is null");
            return (Criteria) this;
        }

        public Criteria andGlassPriceIsNotNull() {
            addCriterion("glass_price_ is not null");
            return (Criteria) this;
        }

        public Criteria andGlassPriceEqualTo(String value) {
            addCriterion("glass_price_ =", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceNotEqualTo(String value) {
            addCriterion("glass_price_ <>", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceGreaterThan(String value) {
            addCriterion("glass_price_ >", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceGreaterThanOrEqualTo(String value) {
            addCriterion("glass_price_ >=", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceLessThan(String value) {
            addCriterion("glass_price_ <", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceLessThanOrEqualTo(String value) {
            addCriterion("glass_price_ <=", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceLike(String value) {
            addCriterion("glass_price_ like", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceNotLike(String value) {
            addCriterion("glass_price_ not like", value, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceIn(List<String> values) {
            addCriterion("glass_price_ in", values, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceNotIn(List<String> values) {
            addCriterion("glass_price_ not in", values, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceBetween(String value1, String value2) {
            addCriterion("glass_price_ between", value1, value2, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andGlassPriceNotBetween(String value1, String value2) {
            addCriterion("glass_price_ not between", value1, value2, "glassPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price_ is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price_ is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(String value) {
            addCriterion("total_price_ =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(String value) {
            addCriterion("total_price_ <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(String value) {
            addCriterion("total_price_ >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("total_price_ >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(String value) {
            addCriterion("total_price_ <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("total_price_ <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLike(String value) {
            addCriterion("total_price_ like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotLike(String value) {
            addCriterion("total_price_ not like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<String> values) {
            addCriterion("total_price_ in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<String> values) {
            addCriterion("total_price_ not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(String value1, String value2) {
            addCriterion("total_price_ between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(String value1, String value2) {
            addCriterion("total_price_ not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTelNumIsNull() {
            addCriterion("tel_num_ is null");
            return (Criteria) this;
        }

        public Criteria andTelNumIsNotNull() {
            addCriterion("tel_num_ is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumEqualTo(String value) {
            addCriterion("tel_num_ =", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotEqualTo(String value) {
            addCriterion("tel_num_ <>", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThan(String value) {
            addCriterion("tel_num_ >", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThanOrEqualTo(String value) {
            addCriterion("tel_num_ >=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThan(String value) {
            addCriterion("tel_num_ <", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThanOrEqualTo(String value) {
            addCriterion("tel_num_ <=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLike(String value) {
            addCriterion("tel_num_ like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotLike(String value) {
            addCriterion("tel_num_ not like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumIn(List<String> values) {
            addCriterion("tel_num_ in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotIn(List<String> values) {
            addCriterion("tel_num_ not in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumBetween(String value1, String value2) {
            addCriterion("tel_num_ between", value1, value2, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotBetween(String value1, String value2) {
            addCriterion("tel_num_ not between", value1, value2, "telNum");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment_ is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment_ is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment_ =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment_ <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment_ >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_ >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment_ <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment_ <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment_ like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment_ not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment_ in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment_ not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment_ between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment_ not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id_ is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id_ =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id_ <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id_ >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id_ >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id_ <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id_ <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id_ in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id_ not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id_ between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id_ not between", value1, value2, "managerId");
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