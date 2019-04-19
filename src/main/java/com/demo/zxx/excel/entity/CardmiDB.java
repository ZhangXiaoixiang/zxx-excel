package com.demo.zxx.excel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

/**
 *excel入库转换模型 数据库
 */
public class CardmiDB extends BaseRowModel implements Serializable {

    @ExcelProperty(index = 0)
    private String cardmi_card_name;

    @ExcelProperty(index = 1)
    private String cardmi_card_password;

    @ExcelProperty(index = 2)
    private String cardmi_card_money;

    @ExcelProperty(index = 3)
    private String cardmi_card_sell;

    public void setCardmi_card_name(String cardmi_card_name) {
        this.cardmi_card_name = cardmi_card_name;
    }

    public void setCardmi_card_password(String cardmi_card_password) {
        this.cardmi_card_password = cardmi_card_password;
    }

    public void setCardmi_card_money(String cardmi_card_money) {
        this.cardmi_card_money = cardmi_card_money;
    }

    public void setCardmi_card_sell(String cardmi_card_sell) {
        this.cardmi_card_sell = cardmi_card_sell;
    }

    @Override
    public String toString() {
        return "CardmiDB{" +
                "cardmi_card_name='" + cardmi_card_name + '\'' +
                ", cardmi_card_password='" + cardmi_card_password + '\'' +
                ", cardmi_card_money='" + cardmi_card_money + '\'' +
                ", cardmi_card_sell='" + cardmi_card_sell + '\'' +
                '}';
    }
}
