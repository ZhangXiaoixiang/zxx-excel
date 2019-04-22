package com.demo.zxx.excel.dao;

import com.demo.zxx.excel.entity.Cardmi;

import java.util.List;

public interface CardmiDao {

    int insertSelective(Cardmi record);

    List<Cardmi> selectCardmiList();


}