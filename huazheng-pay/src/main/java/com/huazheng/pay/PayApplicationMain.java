package com.huazheng.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanghuazheng
 * @title: PayApplicationMain
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 18:46
 */
@SpringBootApplication
@MapperScan(basePackages = "com.huazheng.pay.dao" )
public class PayApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(PayApplicationMain.class,args);
    }
}
