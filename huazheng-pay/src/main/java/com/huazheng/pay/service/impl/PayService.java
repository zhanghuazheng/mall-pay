package com.huazheng.pay.service.impl;

import com.huazheng.pay.service.IPayService;
import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author zhanghuazheng
 * @title: PayService
 * @projectName mall-pay
 * @description: 创建支付订单
 * @date 2020/3/15 21:37
 */
@Slf4j
@Service
public class PayService implements IPayService {
    @Resource
    private BestPayServiceImpl bestPayService;
    @Override
    public PayResponse create(String orderNo, BigDecimal money) {
        PayRequest request = new PayRequest();
        request.setOrderId(orderNo);
        request.setOrderName("测试微信支付");
        request.setOrderAmount(money.doubleValue());
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);

        PayResponse response = bestPayService.pay(request);
        log.info("response={}",response);
        return  response;

    }

    @Override
    public String asynNotify(String notifyData) {
        //1. 签名检验
        PayResponse payResponse = bestPayService.asyncNotify(notifyData);
        log.info("payResponse={}", payResponse);

        //2. 金额校验（从数据库查订单）

        //3. 修改订单支付状态

        if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.WX) {
            //4. 告诉微信不要再通知了
            return "<xml>\n" +
                    "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                    "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                    "</xml>";
        }else if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.ALIPAY) {
            return "success";
        }
        throw new RuntimeException("异步通知中错误的支付平台");
    }
}
