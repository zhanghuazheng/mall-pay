package com.huazheng.mall.dao;

import com.huazheng.mall.MallApplicationTests;
import com.huazheng.mall.pojo.Order;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author zhanghuazheng
 * @title: OrderMapperTest
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 17:08
 */
public class OrderMapperTest extends MallApplicationTests {
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        Order order = new Order();
        order.setId(1);
        order.setShippingId(111);
        order.setCreateTime(new Date());
        order.setUserId(221);
        int insert = orderMapper.insert(order);
        System.out.println(insert);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println(order.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}