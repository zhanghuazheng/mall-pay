package com.huazheng.pay.service.impl;

import com.huazheng.pay.PayApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author zhanghuazheng
 * @title: PayServiceTest
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 22:08
 */
public class PayServiceTest extends PayApplicationTests {
    @Resource
private PayService payService;

    @Test
    public void create() {
        payService.create("1120271",new BigDecimal("0.01"));
    }


}