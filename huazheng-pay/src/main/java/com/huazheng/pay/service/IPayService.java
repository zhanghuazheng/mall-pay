package com.huazheng.pay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * @author zhanghuazheng
 * @title: IPayService
 * @projectName mall-pay
 * @description: 微信支付
 * @date 2020/3/15 21:35
 */

public interface IPayService {
    /**
     * 创建支付订单
     * @param orderNo 订单号
     * @param money 订单金额
     */
    public PayResponse create(String orderNo, BigDecimal money);

    String asynNotify(String notifyData);
}
