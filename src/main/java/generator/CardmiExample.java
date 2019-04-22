package generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardmiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CardmiExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameIsNull() {
            addCriterion("cardmi_card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameIsNotNull() {
            addCriterion("cardmi_card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameEqualTo(String value) {
            addCriterion("cardmi_card_name =", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameNotEqualTo(String value) {
            addCriterion("cardmi_card_name <>", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameGreaterThan(String value) {
            addCriterion("cardmi_card_name >", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("cardmi_card_name >=", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameLessThan(String value) {
            addCriterion("cardmi_card_name <", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameLessThanOrEqualTo(String value) {
            addCriterion("cardmi_card_name <=", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameLike(String value) {
            addCriterion("cardmi_card_name like", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameNotLike(String value) {
            addCriterion("cardmi_card_name not like", value, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameIn(List<String> values) {
            addCriterion("cardmi_card_name in", values, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameNotIn(List<String> values) {
            addCriterion("cardmi_card_name not in", values, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameBetween(String value1, String value2) {
            addCriterion("cardmi_card_name between", value1, value2, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardNameNotBetween(String value1, String value2) {
            addCriterion("cardmi_card_name not between", value1, value2, "cardmiCardName");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordIsNull() {
            addCriterion("cardmi_card_password is null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordIsNotNull() {
            addCriterion("cardmi_card_password is not null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordEqualTo(String value) {
            addCriterion("cardmi_card_password =", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordNotEqualTo(String value) {
            addCriterion("cardmi_card_password <>", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordGreaterThan(String value) {
            addCriterion("cardmi_card_password >", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cardmi_card_password >=", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordLessThan(String value) {
            addCriterion("cardmi_card_password <", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordLessThanOrEqualTo(String value) {
            addCriterion("cardmi_card_password <=", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordLike(String value) {
            addCriterion("cardmi_card_password like", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordNotLike(String value) {
            addCriterion("cardmi_card_password not like", value, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordIn(List<String> values) {
            addCriterion("cardmi_card_password in", values, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordNotIn(List<String> values) {
            addCriterion("cardmi_card_password not in", values, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordBetween(String value1, String value2) {
            addCriterion("cardmi_card_password between", value1, value2, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardPasswordNotBetween(String value1, String value2) {
            addCriterion("cardmi_card_password not between", value1, value2, "cardmiCardPassword");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyIsNull() {
            addCriterion("cardmi_card_money is null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyIsNotNull() {
            addCriterion("cardmi_card_money is not null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_money =", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_money <>", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyGreaterThan(BigDecimal value) {
            addCriterion("cardmi_card_money >", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_money >=", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyLessThan(BigDecimal value) {
            addCriterion("cardmi_card_money <", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_money <=", value, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyIn(List<BigDecimal> values) {
            addCriterion("cardmi_card_money in", values, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("cardmi_card_money not in", values, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardmi_card_money between", value1, value2, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardmi_card_money not between", value1, value2, "cardmiCardMoney");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellIsNull() {
            addCriterion("cardmi_card_sell is null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellIsNotNull() {
            addCriterion("cardmi_card_sell is not null");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_sell =", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellNotEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_sell <>", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellGreaterThan(BigDecimal value) {
            addCriterion("cardmi_card_sell >", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_sell >=", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellLessThan(BigDecimal value) {
            addCriterion("cardmi_card_sell <", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cardmi_card_sell <=", value, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellIn(List<BigDecimal> values) {
            addCriterion("cardmi_card_sell in", values, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellNotIn(List<BigDecimal> values) {
            addCriterion("cardmi_card_sell not in", values, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardmi_card_sell between", value1, value2, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andCardmiCardSellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cardmi_card_sell not between", value1, value2, "cardmiCardSell");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNull() {
            addCriterion("sale_state is null");
            return (Criteria) this;
        }

        public Criteria andSaleStateIsNotNull() {
            addCriterion("sale_state is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStateEqualTo(Integer value) {
            addCriterion("sale_state =", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotEqualTo(Integer value) {
            addCriterion("sale_state <>", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThan(Integer value) {
            addCriterion("sale_state >", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_state >=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThan(Integer value) {
            addCriterion("sale_state <", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateLessThanOrEqualTo(Integer value) {
            addCriterion("sale_state <=", value, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateIn(List<Integer> values) {
            addCriterion("sale_state in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotIn(List<Integer> values) {
            addCriterion("sale_state not in", values, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateBetween(Integer value1, Integer value2) {
            addCriterion("sale_state between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andSaleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_state not between", value1, value2, "saleState");
            return (Criteria) this;
        }

        public Criteria andValidStateIsNull() {
            addCriterion("valid_state is null");
            return (Criteria) this;
        }

        public Criteria andValidStateIsNotNull() {
            addCriterion("valid_state is not null");
            return (Criteria) this;
        }

        public Criteria andValidStateEqualTo(Integer value) {
            addCriterion("valid_state =", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotEqualTo(Integer value) {
            addCriterion("valid_state <>", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateGreaterThan(Integer value) {
            addCriterion("valid_state >", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_state >=", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateLessThan(Integer value) {
            addCriterion("valid_state <", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateLessThanOrEqualTo(Integer value) {
            addCriterion("valid_state <=", value, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateIn(List<Integer> values) {
            addCriterion("valid_state in", values, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotIn(List<Integer> values) {
            addCriterion("valid_state not in", values, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateBetween(Integer value1, Integer value2) {
            addCriterion("valid_state between", value1, value2, "validState");
            return (Criteria) this;
        }

        public Criteria andValidStateNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_state not between", value1, value2, "validState");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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