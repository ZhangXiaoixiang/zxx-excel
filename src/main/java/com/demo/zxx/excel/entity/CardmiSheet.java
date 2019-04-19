package com.demo.zxx.excel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

/**
 *
 */
public class CardmiSheet extends BaseRowModel implements Serializable {
    /**
     * 卡密账号
     */
    @ExcelProperty(value = "卡密账号" ,index = 0)
    private String cardmiCardName;

    /**
     * 卡密密码
     */
    @ExcelProperty(value = "卡密密码",index = 1)
    private String cardmiCardPassword;

    /**
     * 卡密面值
     */
    @ExcelProperty(value = "卡密面值",index = 2)
    private Double cardmiCardMoney;

    /**
     * 实际售价
     */
    @ExcelProperty(value = "实际售价",index = 3)
    private Double cardmiCardSell;

    public CardmiSheet(String cardmiCardName) {
        this.cardmiCardName = cardmiCardName;
    }

    public CardmiSheet(String cardmiCardName, String cardmiCardPassword, Double cardmiCardMoney, Double cardmiCardSell) {
        this.cardmiCardName = cardmiCardName;
        this.cardmiCardPassword = cardmiCardPassword;
        this.cardmiCardMoney = cardmiCardMoney;
        this.cardmiCardSell = cardmiCardSell;
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

    public CardmiSheet() {
    }
}
