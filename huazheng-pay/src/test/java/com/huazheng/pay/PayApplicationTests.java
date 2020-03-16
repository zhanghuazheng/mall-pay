package com.huazheng.pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author zhanghuazheng
 * @title: PayApplicationTests
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 18:48
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayApplicationTests {
    @Test
    public void bigDicemlTest() {
       BigDecimal money = new BigDecimal("1181881.122221");
//        System.out.println(Double.valueOf(money.toString()));
        System.out.println("111");
    }
}
