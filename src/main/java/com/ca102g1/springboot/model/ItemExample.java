package com.ca102g1.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemNoIsNull() {
            addCriterion("ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("ITEM_NO =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("ITEM_NO <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("ITEM_NO >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NO >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("ITEM_NO <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NO <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("ITEM_NO like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("ITEM_NO not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("ITEM_NO in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("ITEM_NO not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("ITEM_NO between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("ITEM_NO not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("ITEM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("ITEM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Long value) {
            addCriterion("ITEM_PRICE =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Long value) {
            addCriterion("ITEM_PRICE <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Long value) {
            addCriterion("ITEM_PRICE >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_PRICE >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Long value) {
            addCriterion("ITEM_PRICE <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_PRICE <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Long> values) {
            addCriterion("ITEM_PRICE in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Long> values) {
            addCriterion("ITEM_PRICE not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Long value1, Long value2) {
            addCriterion("ITEM_PRICE between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_PRICE not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassIsNull() {
            addCriterion("ITEM_PRIMARY_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassIsNotNull() {
            addCriterion("ITEM_PRIMARY_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassEqualTo(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS =", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassNotEqualTo(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS <>", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassGreaterThan(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS >", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassGreaterThanOrEqualTo(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS >=", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassLessThan(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS <", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassLessThanOrEqualTo(Short value) {
            addCriterion("ITEM_PRIMARY_CLASS <=", value, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassIn(List<Short> values) {
            addCriterion("ITEM_PRIMARY_CLASS in", values, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassNotIn(List<Short> values) {
            addCriterion("ITEM_PRIMARY_CLASS not in", values, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassBetween(Short value1, Short value2) {
            addCriterion("ITEM_PRIMARY_CLASS between", value1, value2, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemPrimaryClassNotBetween(Short value1, Short value2) {
            addCriterion("ITEM_PRIMARY_CLASS not between", value1, value2, "itemPrimaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassIsNull() {
            addCriterion("ITEM_SECONDARY_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassIsNotNull() {
            addCriterion("ITEM_SECONDARY_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassEqualTo(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS =", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassNotEqualTo(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS <>", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassGreaterThan(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS >", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS >=", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassLessThan(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS <", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_SECONDARY_CLASS <=", value, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassIn(List<Long> values) {
            addCriterion("ITEM_SECONDARY_CLASS in", values, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassNotIn(List<Long> values) {
            addCriterion("ITEM_SECONDARY_CLASS not in", values, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassBetween(Long value1, Long value2) {
            addCriterion("ITEM_SECONDARY_CLASS between", value1, value2, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemSecondaryClassNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_SECONDARY_CLASS not between", value1, value2, "itemSecondaryClass");
            return (Criteria) this;
        }

        public Criteria andItemOwnerIsNull() {
            addCriterion("ITEM_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andItemOwnerIsNotNull() {
            addCriterion("ITEM_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andItemOwnerEqualTo(String value) {
            addCriterion("ITEM_OWNER =", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerNotEqualTo(String value) {
            addCriterion("ITEM_OWNER <>", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerGreaterThan(String value) {
            addCriterion("ITEM_OWNER >", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_OWNER >=", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerLessThan(String value) {
            addCriterion("ITEM_OWNER <", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerLessThanOrEqualTo(String value) {
            addCriterion("ITEM_OWNER <=", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerLike(String value) {
            addCriterion("ITEM_OWNER like", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerNotLike(String value) {
            addCriterion("ITEM_OWNER not like", value, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerIn(List<String> values) {
            addCriterion("ITEM_OWNER in", values, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerNotIn(List<String> values) {
            addCriterion("ITEM_OWNER not in", values, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerBetween(String value1, String value2) {
            addCriterion("ITEM_OWNER between", value1, value2, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andItemOwnerNotBetween(String value1, String value2) {
            addCriterion("ITEM_OWNER not between", value1, value2, "itemOwner");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchIsNull() {
            addCriterion("IS_FB_LAUNCH is null");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchIsNotNull() {
            addCriterion("IS_FB_LAUNCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchEqualTo(Short value) {
            addCriterion("IS_FB_LAUNCH =", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchNotEqualTo(Short value) {
            addCriterion("IS_FB_LAUNCH <>", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchGreaterThan(Short value) {
            addCriterion("IS_FB_LAUNCH >", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_FB_LAUNCH >=", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchLessThan(Short value) {
            addCriterion("IS_FB_LAUNCH <", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchLessThanOrEqualTo(Short value) {
            addCriterion("IS_FB_LAUNCH <=", value, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchIn(List<Short> values) {
            addCriterion("IS_FB_LAUNCH in", values, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchNotIn(List<Short> values) {
            addCriterion("IS_FB_LAUNCH not in", values, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchBetween(Short value1, Short value2) {
            addCriterion("IS_FB_LAUNCH between", value1, value2, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsFbLaunchNotBetween(Short value1, Short value2) {
            addCriterion("IS_FB_LAUNCH not between", value1, value2, "isFbLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchIsNull() {
            addCriterion("IS_MALL_LAUNCH is null");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchIsNotNull() {
            addCriterion("IS_MALL_LAUNCH is not null");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchEqualTo(Short value) {
            addCriterion("IS_MALL_LAUNCH =", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchNotEqualTo(Short value) {
            addCriterion("IS_MALL_LAUNCH <>", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchGreaterThan(Short value) {
            addCriterion("IS_MALL_LAUNCH >", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_MALL_LAUNCH >=", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchLessThan(Short value) {
            addCriterion("IS_MALL_LAUNCH <", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchLessThanOrEqualTo(Short value) {
            addCriterion("IS_MALL_LAUNCH <=", value, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchIn(List<Short> values) {
            addCriterion("IS_MALL_LAUNCH in", values, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchNotIn(List<Short> values) {
            addCriterion("IS_MALL_LAUNCH not in", values, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchBetween(Short value1, Short value2) {
            addCriterion("IS_MALL_LAUNCH between", value1, value2, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andIsMallLaunchNotBetween(Short value1, Short value2) {
            addCriterion("IS_MALL_LAUNCH not between", value1, value2, "isMallLaunch");
            return (Criteria) this;
        }

        public Criteria andItemInventoryIsNull() {
            addCriterion("ITEM_INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andItemInventoryIsNotNull() {
            addCriterion("ITEM_INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andItemInventoryEqualTo(Long value) {
            addCriterion("ITEM_INVENTORY =", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryNotEqualTo(Long value) {
            addCriterion("ITEM_INVENTORY <>", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryGreaterThan(Long value) {
            addCriterion("ITEM_INVENTORY >", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_INVENTORY >=", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryLessThan(Long value) {
            addCriterion("ITEM_INVENTORY <", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_INVENTORY <=", value, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryIn(List<Long> values) {
            addCriterion("ITEM_INVENTORY in", values, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryNotIn(List<Long> values) {
            addCriterion("ITEM_INVENTORY not in", values, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryBetween(Long value1, Long value2) {
            addCriterion("ITEM_INVENTORY between", value1, value2, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemInventoryNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_INVENTORY not between", value1, value2, "itemInventory");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNull() {
            addCriterion("ITEM_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNotNull() {
            addCriterion("ITEM_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION =", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION <>", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThan(String value) {
            addCriterion("ITEM_DESCRIPTION >", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION >=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThan(String value) {
            addCriterion("ITEM_DESCRIPTION <", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION <=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLike(String value) {
            addCriterion("ITEM_DESCRIPTION like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotLike(String value) {
            addCriterion("ITEM_DESCRIPTION not like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIn(List<String> values) {
            addCriterion("ITEM_DESCRIPTION in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotIn(List<String> values) {
            addCriterion("ITEM_DESCRIPTION not in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionBetween(String value1, String value2) {
            addCriterion("ITEM_DESCRIPTION between", value1, value2, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESCRIPTION not between", value1, value2, "itemDescription");
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