package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id) {

        return "线程池："+Thread.currentThread().getName()+"paymentService"+id+"haha";
    }


    public String paymentInfo_timeout   (Integer id) {

                try {
                    TimeUnit.SECONDS.sleep(3);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }finally {

                        }
        return "线程池："+Thread.currentThread().getName()+"paymentService"+id+"haha"+"耗时 3秒";
    }
}



