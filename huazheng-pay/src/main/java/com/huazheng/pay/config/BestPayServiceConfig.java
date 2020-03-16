package com.huazheng.pay.config;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanghuazheng
 * @title: BestPayServiceConfig
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/16 15:33
 */
@Configuration
public class BestPayServiceConfig {
    @Bean
    public BestPayServiceImpl getBestPayService(){
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wxd898fcb01713c658");
        wxPayConfig.setMchId("1483469312");
        wxPayConfig.setMchKey("098F6BCD4621D373CADE4E832627B4F6");
        wxPayConfig.setNotifyUrl("localhost");
//        wxPayConfig.setNotifyUrl("http://huazheng/pay/notify");

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        return bestPayService;
    }
}
