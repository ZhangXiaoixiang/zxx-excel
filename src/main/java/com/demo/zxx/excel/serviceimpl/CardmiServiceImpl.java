package com.demo.zxx.excel.serviceimpl;

import com.demo.zxx.excel.dao.CardmiDao;
import com.demo.zxx.excel.entity.Cardmi;
import com.demo.zxx.excel.service.CardmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardmiServiceImpl implements CardmiService {
    @Autowired
    private CardmiDao cardmiDao;
    @Override
    public List<Cardmi> findCardmiList() {
        List<Cardmi> cardmis = cardmiDao.selectCardmiList();
        return cardmis;
    }
}
