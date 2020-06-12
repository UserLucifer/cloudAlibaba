package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderHystrixController {

    @Resource
    PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){

        String s = paymentHystrixService.paymentInfo_OK(id);
        System.out.println(s);
        return s;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "15000")
    }
    )
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){

        String s = paymentHystrixService.paymentInfo_TimeOut(id);
        System.out.println(s);
        return s;
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {

        return "我是消费者80，对方支付系统繁忙，请10秒后重试，或者检查自己运行出错检查自己";
    }


}
