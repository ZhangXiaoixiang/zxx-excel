package com.demo.zxx.excel.cardmi;

import com.demo.zxx.excel.entity.Cardmi;
import com.demo.zxx.excel.entity.CardmiDB;
import com.demo.zxx.excel.entity.CardmiSheet;
import com.demo.zxx.excel.excel.ExcelUtil;
import com.demo.zxx.excel.service.CardmiService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CardmiCtr {
    @Autowired
    private CardmiService cardmiService;

    /**
     * 导出 Excel（一个 sheet）
     */
    @RequestMapping(value = "cardmi/export", method = RequestMethod.GET)
    public void writeExcel(HttpServletResponse response) throws IOException {
        List<Cardmi> cardmiList = cardmiService.findCardmiList();
        List<CardmiSheet> list = list = new ArrayList<>();//集合只有一个,所有放在循环外面
        CardmiSheet cardmiSheet = null;
        for (int i = 0; i < cardmiList.size(); i++) {
            cardmiSheet = new CardmiSheet();//表个数据是不同的,所以new写在循环里面
            cardmiSheet.setCardmiCardName(cardmiList.get(i).getCardmiCardName());
            cardmiSheet.setCardmiCardPassword(cardmiList.get(i).getCardmiCardPassword());
            cardmiSheet.setCardmiCardMoney(cardmiList.get(i).getCardmiCardMoney());
            cardmiSheet.setCardmiCardSell(cardmiList.get(i).getCardmiCardSell());
            list.add(cardmiSheet);
        }
        String fileName = "cardmiExport";
        String sheetName = "cardmi";
        ExcelUtil.writeExcel(response, list, fileName, sheetName, new CardmiSheet());
    }

    /**
     * 读取 Excel（指定某个 sheet）
     * 4
     */
    @RequestMapping(value = "cardmi/read", method = RequestMethod.POST)
    public Object readExcel(MultipartFile excel, Integer sheetNo, @RequestParam(defaultValue = "1") int headLineNum) {
        if (excel == null) {
            System.out.println("excle为空!" + sheetNo + headLineNum);
            System.out.println("excle的");

            return "excle为空!";
        }
        System.out.println(sheetNo + "   " + headLineNum);
        List<Object> list = ExcelUtil.readExcel(excel, new CardmiDB(), 4, headLineNum);

        System.out.println("excel   "+excel);
        System.out.println("readExcel读取后:   "+list);
        Cardmi cardmi=new Cardmi();
        //注意去除表头(以行作为集合的对象)
        for (int i = 1; i < list.size(); i++) {
//            System.out.println("不要表头");
//            System.out.println("行  "+list.get(i));
            //list.get(i);//这是一个集合list
            List<String> list1=  (List<String>)list.get(i);//这里需要转一下
            cardmi.setCardmiCardName("中国石油卡密");
            cardmi.setType(1);
            cardmi.setCardmiCardName(list1.get(0));
            cardmi.setCardmiCardPassword(list1.get(1));
            cardmi.setCardmiCardMoney(Double.valueOf(list1.get(2)));
            cardmi.setCardmiCardSell(Double.valueOf(list1.get(3)));
//            for (int i1 = 0; i1 < list1.size(); i1++) {
//              cardmi.setCardmiCardName(list1.get(i1));
//
//                System.out.println(list1.get(i1));
//            }
            System.out.println("卡密账号: "+list1.get(0));
            System.out.println("卡密密码: "+list1.get(1));
            System.out.println("卡密面值: "+list1.get(2));
            System.out.println("卡密售价: "+list1.get(3));
            System.out.println("--------------");
            cardmiService.addExcelCardmi(cardmi);


        }

        return ExcelUtil.readExcel(excel, new CardmiDB(), 4, headLineNum);
    }


    @RequestMapping("/all")
    public Object getAll() {
        List<Cardmi> cardmiList = cardmiService.findCardmiList();
        System.out.println(cardmiList);
        return cardmiList;
    }

}
