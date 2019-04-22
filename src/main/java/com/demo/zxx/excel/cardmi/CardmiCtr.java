package com.demo.zxx.excel.cardmi;

import com.demo.zxx.excel.entity.Cardmi;
import com.demo.zxx.excel.entity.CardmiDB;
import com.demo.zxx.excel.entity.CardmiSheet;
import com.demo.zxx.excel.excel.ExcelUtil;
import com.demo.zxx.excel.service.CardmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 后台控制层
 */
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
        String fileName = "cardmiExport";//文件名称
        String sheetName = "cardmi";//表格名称
        ExcelUtil.writeExcel(response, list, fileName, sheetName, new CardmiSheet());
    }

    /**
     * 读取 Excel（指定某个 sheet）
     * sheet 可以由前端携带列数,但是一般写死就行了,比如需要4列信息
     */
    @RequestMapping(value = "cardmi/read", method = RequestMethod.POST)
    public Object readExcel(MultipartFile excel, Integer sheetNo, @RequestParam(defaultValue = "1") int headLineNum) {
        if (excel == null) {
            System.out.println("excle为空!" + sheetNo + headLineNum);
            System.out.println("excle的");
            return "excle为空!";
        }
        System.out.println("表格列数: "+sheetNo + "   表格头的数量(比如1表示第一行是表头,不是数据)" + headLineNum);
        List<Object> list = ExcelUtil.readExcel(excel, new CardmiDB(), 4, headLineNum);
        System.out.println("excel对象          "+excel);
        System.out.println("readExcel读取后:   "+list);
        Cardmi cardmi=new Cardmi();//创建对象
        //注意去除表头(以行作为集合的对象),比如第一行是表头,第二行才是数据那么i=1开始,以此类推
        for (int i = 1; i < list.size(); i++) {
            List<String> list1=  (List<String>)list.get(i);//这里需要转一下
            cardmi.setCompanyName("中国石油卡密");
            cardmi.setType(1);
            cardmi.setCardmiCardName(list1.get(0));//把表格数据获取到
            cardmi.setCardmiCardPassword(list1.get(1));//把表格数据获取到
            cardmi.setCardmiCardMoney(Double.valueOf(list1.get(2)));//把表格数据获取到
            cardmi.setCardmiCardSell(Double.valueOf(list1.get(3)));//把表格数据获取到
            cardmi.setSaleState(0);
            cardmi.setValidState(0);
            cardmi.setDate(new Date());
            cardmi.setProductId(3);//这个根据金额和类别去数据库查询的,所以为了方便这里只是个例子,暂时写死
            System.out.print("卡密账号: "+list1.get(0));
            System.out.print("   卡密密码: "+list1.get(1));
            System.out.print("   卡密面值: "+list1.get(2));
            System.out.print("   卡密售价: "+list1.get(3)+"\n");
            System.out.println("--------------------------------------------------------------------------------");
            cardmiService.addExcelCardmi(cardmi);//没有处理异常,未来看起来简单,你知道怎么操作就像
        }
        return ExcelUtil.readExcel(excel, new CardmiDB(), 4, headLineNum);
    }

    /**
     * 查询所有卡密 测试接口
     * @return
     */
    @RequestMapping("/all")
    public Object getAll() {
        List<Cardmi> cardmiList = cardmiService.findCardmiList();
        System.out.println(cardmiList);
        return cardmiList;
    }

}
