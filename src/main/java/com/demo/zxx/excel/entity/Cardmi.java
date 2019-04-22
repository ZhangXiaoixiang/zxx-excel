package com.demo.zxx.excel.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * cardmi 数据库表    自动生成的实体类(手写也可以,用插件生成快一点)
 * @author 
 */
public class Cardmi implements Serializable {
    /**
     * 卡密销售表主键ID
     */
    private Integer id;

    /**
     * 卡密中文名称(中国石油卡密,中国石化卡密)
     */
    private String companyName;

    /**
     * 卡密类型(1中国石油卡密,2中国石化卡密)
     */
    private Integer type;

    /**
     * 卡密账号
     */
    private String cardmiCardName;

    /**
     * 卡密密码
     */
    private String cardmiCardPassword;

    /**
     * 卡密面值
     */
    private Double cardmiCardMoney;

    /**
     * 实际售价
     */
    private Double cardmiCardSell;

    /**
     * 销售状态(0未售出,1已售出)
     */
    private Integer saleState;

    /**
     * 否删除(0未删除,1删除了,仅仅标识该数据时候存在,和销售状态无关)
     */
    private Integer validState;

    /**
     * 时间
     */
    private Date date;

    /**
     * 产品id(关联cardmiproduct表)
     */
    private Integer productId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCardmiCardName() {
        return cardmiCardName;
    }

    public void setCardmiCardName(String cardmiCardName) {
        this.cardmiCardName = cardmiCardName;
    }

    public String getCardmiCardPassword() {
        return cardmiCardPassword;
    }

    public void setCardmiCardPassword(String cardmiCardPassword) {
        this.cardmiCardPassword = cardmiCardPassword;
    }

    public Double getCardmiCardMoney() {
        return cardmiCardMoney;
    }

    public void setCardmiCardMoney(Double cardmiCardMoney) {
        this.cardmiCardMoney = cardmiCardMoney;
    }

    public Double getCardmiCardSell() {
        return cardmiCardSell;
    }

    public void setCardmiCardSell(Double cardmiCardSell) {
        this.cardmiCardSell = cardmiCardSell;
    }

    public Integer getSaleState() {
        return saleState;
    }

    public void setSaleState(Integer saleState) {
        this.saleState = saleState;
    }

    public Integer getValidState() {
        return validState;
    }

    public void setValidState(Integer validState) {
        this.validState = validState;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cardmi other = (Cardmi) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCardmiCardName() == null ? other.getCardmiCardName() == null : this.getCardmiCardName().equals(other.getCardmiCardName()))
            && (this.getCardmiCardPassword() == null ? other.getCardmiCardPassword() == null : this.getCardmiCardPassword().equals(other.getCardmiCardPassword()))
            && (this.getCardmiCardMoney() == null ? other.getCardmiCardMoney() == null : this.getCardmiCardMoney().equals(other.getCardmiCardMoney()))
            && (this.getCardmiCardSell() == null ? other.getCardmiCardSell() == null : this.getCardmiCardSell().equals(other.getCardmiCardSell()))
            && (this.getSaleState() == null ? other.getSaleState() == null : this.getSaleState().equals(other.getSaleState()))
            && (this.getValidState() == null ? other.getValidState() == null : this.getValidState().equals(other.getValidState()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCardmiCardName() == null) ? 0 : getCardmiCardName().hashCode());
        result = prime * result + ((getCardmiCardPassword() == null) ? 0 : getCardmiCardPassword().hashCode());
        result = prime * result + ((getCardmiCardMoney() == null) ? 0 : getCardmiCardMoney().hashCode());
        result = prime * result + ((getCardmiCardSell() == null) ? 0 : getCardmiCardSell().hashCode());
        result = prime * result + ((getSaleState() == null) ? 0 : getSaleState().hashCode());
        result = prime * result + ((getValidState() == null) ? 0 : getValidState().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", type=").append(type);
        sb.append(", cardmiCardName=").append(cardmiCardName);
        sb.append(", cardmiCardPassword=").append(cardmiCardPassword);
        sb.append(", cardmiCardMoney=").append(cardmiCardMoney);
        sb.append(", cardmiCardSell=").append(cardmiCardSell);
        sb.append(", saleState=").append(saleState);
        sb.append(", validState=").append(validState);
        sb.append(", date=").append(date);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}