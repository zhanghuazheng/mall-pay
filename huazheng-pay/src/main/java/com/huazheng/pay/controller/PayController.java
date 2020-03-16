package com.huazheng.pay.controller;

import com.huazheng.pay.service.impl.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;

/**
 * @author zhanghuazheng
 * @title: PayController
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 22:43
 */
@Controller
@RequestMapping("/pay")
public class PayController {
    @Resource
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView createOrder(){
        String orderNo = String.valueOf(new Random(10000).nextInt());
        PayResponse response = payService.create(orderNo, new BigDecimal("0.01"));
        HashMap<String, String> map = new HashMap<>();
        map.put("code",response.getCodeUrl());
        return new ModelAndView("order",map);
    }

    @PostMapping("/notify")
    @ResponseBody
    public String asyacNotify(@RequestBody String notifyData){
        return payService.asynNotify(notifyData);
    }

}
