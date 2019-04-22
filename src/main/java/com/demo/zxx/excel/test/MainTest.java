package com.demo.zxx.excel.test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<String[]> list=new ArrayList<>();
        list.add(new String[]{"12345678","0123456","1000","800"});
        list.add(new String[]{"12345672","0123456","1000","800"});
        list.add(new String[]{"12345673","0123456","1000","800"});
        list.add(new String[]{"12345674","0123456","1000","800"});
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.toArray());

        }
    }
}
