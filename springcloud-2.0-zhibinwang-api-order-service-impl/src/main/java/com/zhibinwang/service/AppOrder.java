package com.zhibinwang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 花开
 * @create 2019-08-09 0:13
 * @desc
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class AppOrder {

    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
