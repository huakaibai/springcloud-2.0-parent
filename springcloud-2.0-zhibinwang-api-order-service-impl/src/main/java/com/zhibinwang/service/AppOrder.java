package com.zhibinwang.service;

import com.spring4all.swagger.EnableSwagger2Doc;
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
@EnableSwagger2Doc
public class AppOrder {

    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
