package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient  //必须要用这个注解
public class PaymentMain8006
{
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8006.class, args);
    }
}
