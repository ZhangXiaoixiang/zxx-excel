package com.demo.zxx.excel.service;

import com.demo.zxx.excel.entity.Cardmi;

import java.util.List;

/**
 * 写一个查询和添加(导入导出需要的)  service接口
 */
public interface CardmiService {
    List<Cardmi> findCardmiList();
    Cardmi addExcelCardmi(Cardmi cardmi);
}
