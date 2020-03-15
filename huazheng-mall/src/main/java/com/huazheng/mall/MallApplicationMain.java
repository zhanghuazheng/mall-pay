package com.huazheng.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanghuazheng
 * @title: MallApplicationMain
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 10:40
 */
@SpringBootApplication
@MapperScan(basePackages = "com.huazheng.mall.dao" )
public class MallApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(MallApplicationMain.class,args);
    }
}
