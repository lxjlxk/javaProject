package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoreListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreListExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(String value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(String value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(String value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(String value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(String value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(String value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLike(String value) {
            addCriterion("stu_id like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotLike(String value) {
            addCriterion("stu_id not like", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<String> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<String> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(String value1, String value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(String value1, String value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSubjectIsNull() {
            addCriterion("stu_subject is null");
            return (Criteria) this;
        }

        public Criteria andStuSubjectIsNotNull() {
            addCriterion("stu_subject is not null");
            return (Criteria) this;
        }

        public Criteria andStuSubjectEqualTo(String value) {
            addCriterion("stu_subject =", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectNotEqualTo(String value) {
            addCriterion("stu_subject <>", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectGreaterThan(String value) {
            addCriterion("stu_subject >", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("stu_subject >=", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectLessThan(String value) {
            addCriterion("stu_subject <", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectLessThanOrEqualTo(String value) {
            addCriterion("stu_subject <=", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectLike(String value) {
            addCriterion("stu_subject like", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectNotLike(String value) {
            addCriterion("stu_subject not like", value, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectIn(List<String> values) {
            addCriterion("stu_subject in", values, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectNotIn(List<String> values) {
            addCriterion("stu_subject not in", values, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectBetween(String value1, String value2) {
            addCriterion("stu_subject between", value1, value2, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuSubjectNotBetween(String value1, String value2) {
            addCriterion("stu_subject not between", value1, value2, "stuSubject");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNull() {
            addCriterion("stu_score is null");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNotNull() {
            addCriterion("stu_score is not null");
            return (Criteria) this;
        }

        public Criteria andStuScoreEqualTo(Integer value) {
            addCriterion("stu_score =", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotEqualTo(Integer value) {
            addCriterion("stu_score <>", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThan(Integer value) {
            addCriterion("stu_score >", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_score >=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThan(Integer value) {
            addCriterion("stu_score <", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("stu_score <=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreIn(List<Integer> values) {
            addCriterion("stu_score in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotIn(List<Integer> values) {
            addCriterion("stu_score not in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreBetween(Integer value1, Integer value2) {
            addCriterion("stu_score between", value1, value2, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_score not between", value1, value2, "stuScore");
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