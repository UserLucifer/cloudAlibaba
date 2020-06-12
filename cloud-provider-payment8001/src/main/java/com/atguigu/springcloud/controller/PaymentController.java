package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;


    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        System.out.println("插入结果："+result);

        if (result > 0) {
            return new CommonResult(200,"插入数据库成功",result);
        } else {
            return new CommonResult(400,"插入失败",null);
        }

    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id) {
       Payment payment = paymentService.getPaymentById(id);
        System.out.println("查询结果："+payment);
        logger.info("查询结果："+payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功:sort:  "+serverPort,payment);
        } else {
            return new CommonResult(400,"没有对应记录",null);
        }

    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {

        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println("element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+"\t"+instance.getInstanceId());
        }
        return this.discoveryClient;
    }



}
