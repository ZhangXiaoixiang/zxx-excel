package com.demo.zxx.excel.serviceimpl;

import com.demo.zxx.excel.dao.CardmiDao;
import com.demo.zxx.excel.entity.Cardmi;
import com.demo.zxx.excel.service.CardmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 写一个查询和添加(导入导出需要的) service实现类
 * 日志异常入参判断这里就简化了
 */
import java.util.List;
@Service
public class CardmiServiceImpl implements CardmiService {
    @Autowired
    private CardmiDao cardmiDao;//如果idea编辑器报错,暂时不用太理会,不影响

    /**
     * 查询数据库数据
     * 导出需要这个接口
     * @return
     */
    @Override
    public List<Cardmi> findCardmiList() {
        List<Cardmi> cardmis = cardmiDao.selectCardmiList();
        return cardmis;
    }

    /**
     * 添加数据
     * 导入数据库需要
     * @param cardmi
     * @return
     */
    @Override
    public Cardmi addExcelCardmi(Cardmi cardmi) {
        int i = cardmiDao.insertSelective(cardmi);
        return cardmi;
    }
}
