package com.pet.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeExample() {
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

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("trade_id like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("trade_id not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNull() {
            addCriterion("trade_price is null");
            return (Criteria) this;
        }

        public Criteria andTradePriceIsNotNull() {
            addCriterion("trade_price is not null");
            return (Criteria) this;
        }

        public Criteria andTradePriceEqualTo(String value) {
            addCriterion("trade_price =", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotEqualTo(String value) {
            addCriterion("trade_price <>", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThan(String value) {
            addCriterion("trade_price >", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceGreaterThanOrEqualTo(String value) {
            addCriterion("trade_price >=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThan(String value) {
            addCriterion("trade_price <", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLessThanOrEqualTo(String value) {
            addCriterion("trade_price <=", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceLike(String value) {
            addCriterion("trade_price like", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotLike(String value) {
            addCriterion("trade_price not like", value, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceIn(List<String> values) {
            addCriterion("trade_price in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotIn(List<String> values) {
            addCriterion("trade_price not in", values, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceBetween(String value1, String value2) {
            addCriterion("trade_price between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradePriceNotBetween(String value1, String value2) {
            addCriterion("trade_price not between", value1, value2, "tradePrice");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Integer value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Integer value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Integer value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Integer value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Integer> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Integer> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeDesIsNull() {
            addCriterion("trade_des is null");
            return (Criteria) this;
        }

        public Criteria andTradeDesIsNotNull() {
            addCriterion("trade_des is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDesEqualTo(String value) {
            addCriterion("trade_des =", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesNotEqualTo(String value) {
            addCriterion("trade_des <>", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesGreaterThan(String value) {
            addCriterion("trade_des >", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesGreaterThanOrEqualTo(String value) {
            addCriterion("trade_des >=", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesLessThan(String value) {
            addCriterion("trade_des <", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesLessThanOrEqualTo(String value) {
            addCriterion("trade_des <=", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesLike(String value) {
            addCriterion("trade_des like", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesNotLike(String value) {
            addCriterion("trade_des not like", value, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesIn(List<String> values) {
            addCriterion("trade_des in", values, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesNotIn(List<String> values) {
            addCriterion("trade_des not in", values, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesBetween(String value1, String value2) {
            addCriterion("trade_des between", value1, value2, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeDesNotBetween(String value1, String value2) {
            addCriterion("trade_des not between", value1, value2, "tradeDes");
            return (Criteria) this;
        }

        public Criteria andTradeTitileIsNull() {
            addCriterion("trade_titile is null");
            return (Criteria) this;
        }

        public Criteria andTradeTitileIsNotNull() {
            addCriterion("trade_titile is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTitileEqualTo(String value) {
            addCriterion("trade_titile =", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileNotEqualTo(String value) {
            addCriterion("trade_titile <>", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileGreaterThan(String value) {
            addCriterion("trade_titile >", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileGreaterThanOrEqualTo(String value) {
            addCriterion("trade_titile >=", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileLessThan(String value) {
            addCriterion("trade_titile <", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileLessThanOrEqualTo(String value) {
            addCriterion("trade_titile <=", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileLike(String value) {
            addCriterion("trade_titile like", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileNotLike(String value) {
            addCriterion("trade_titile not like", value, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileIn(List<String> values) {
            addCriterion("trade_titile in", values, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileNotIn(List<String> values) {
            addCriterion("trade_titile not in", values, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileBetween(String value1, String value2) {
            addCriterion("trade_titile between", value1, value2, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeTitileNotBetween(String value1, String value2) {
            addCriterion("trade_titile not between", value1, value2, "tradeTitile");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(Integer value) {
            addCriterion("trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(Integer value) {
            addCriterion("trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(Integer value) {
            addCriterion("trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(Integer value) {
            addCriterion("trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<Integer> values) {
            addCriterion("trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<Integer> values) {
            addCriterion("trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(Integer value1, Integer value2) {
            addCriterion("trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeImageIsNull() {
            addCriterion("trade_image is null");
            return (Criteria) this;
        }

        public Criteria andTradeImageIsNotNull() {
            addCriterion("trade_image is not null");
            return (Criteria) this;
        }

        public Criteria andTradeImageEqualTo(String value) {
            addCriterion("trade_image =", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageNotEqualTo(String value) {
            addCriterion("trade_image <>", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageGreaterThan(String value) {
            addCriterion("trade_image >", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageGreaterThanOrEqualTo(String value) {
            addCriterion("trade_image >=", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageLessThan(String value) {
            addCriterion("trade_image <", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageLessThanOrEqualTo(String value) {
            addCriterion("trade_image <=", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageLike(String value) {
            addCriterion("trade_image like", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageNotLike(String value) {
            addCriterion("trade_image not like", value, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageIn(List<String> values) {
            addCriterion("trade_image in", values, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageNotIn(List<String> values) {
            addCriterion("trade_image not in", values, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageBetween(String value1, String value2) {
            addCriterion("trade_image between", value1, value2, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTradeImageNotBetween(String value1, String value2) {
            addCriterion("trade_image not between", value1, value2, "tradeImage");
            return (Criteria) this;
        }

        public Criteria andTraeAddressIsNull() {
            addCriterion("trae_address is null");
            return (Criteria) this;
        }

        public Criteria andTraeAddressIsNotNull() {
            addCriterion("trae_address is not null");
            return (Criteria) this;
        }

        public Criteria andTraeAddressEqualTo(String value) {
            addCriterion("trae_address =", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressNotEqualTo(String value) {
            addCriterion("trae_address <>", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressGreaterThan(String value) {
            addCriterion("trae_address >", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("trae_address >=", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressLessThan(String value) {
            addCriterion("trae_address <", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressLessThanOrEqualTo(String value) {
            addCriterion("trae_address <=", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressLike(String value) {
            addCriterion("trae_address like", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressNotLike(String value) {
            addCriterion("trae_address not like", value, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressIn(List<String> values) {
            addCriterion("trae_address in", values, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressNotIn(List<String> values) {
            addCriterion("trae_address not in", values, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressBetween(String value1, String value2) {
            addCriterion("trae_address between", value1, value2, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andTraeAddressNotBetween(String value1, String value2) {
            addCriterion("trae_address not between", value1, value2, "traeAddress");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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