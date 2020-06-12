package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {



    public String paymentInfo_OK(Integer id) {

        return "线程池："+Thread.currentThread().getName()+"paymentService"+id+"haha";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_timeout(Integer id) {

                try {
                    TimeUnit.SECONDS.sleep(5);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
        return "线程池："+Thread.currentThread().getName()+"paymentService"+id+"haha"+"耗时 3秒";
    }


    public String  paymentInfo_timeoutHandler(Integer id) {

        return "系统繁忙或者稍后在充实上边出事了，就要执行这里，降级";
    }


}



