package com.demo.zxx.excel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.zxx.excel.dao")
public class ZxxExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxxExcelApplication.class, args);
        System.out.println("模拟数据导出数据库请访问: http://localhost:8080/writeExcel ");
        System.out.println("导出数据库请访问 http://localhost:8080/cardmi/export");
        System.out.println("导入数据库请访问 http://localhost:8080/index");
    }

}
