package com.zhibinwang.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 花开
 * @create 2019-08-15 20:24
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
public class AppPay {
    public static void main(String[] args) {
        SpringApplication.run(AppPay.class,args);
    }

    @RequestMapping("/")
    public String pay(){

        return "这是 支付项目";
    }
}
