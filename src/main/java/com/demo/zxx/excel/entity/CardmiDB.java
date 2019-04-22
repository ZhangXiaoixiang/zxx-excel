package com.demo.zxx.excel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

/**
 *excel入库转换模型 ,这个是excel表格格式的定义对应的实体类模型,用不着和Cardmi(数据库表对应的实体,因为表格时间那些字段,在控制层或者业务层写进去就行了)
 * 这样excel表格只传输只要数据,其他类型判断那些逻辑代码处理
 * ---一句话,需要什么数据,写在这个模型就行了
 *
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
