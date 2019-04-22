package com.demo.zxx.excel.dao;

import com.demo.zxx.excel.entity.Cardmi;

import java.util.List;

/**
 * 写一个查询和添加(导入导出需要的) dao层
 */
public interface CardmiDao {

    int insertSelective(Cardmi record);

    List<Cardmi> selectCardmiList();


}