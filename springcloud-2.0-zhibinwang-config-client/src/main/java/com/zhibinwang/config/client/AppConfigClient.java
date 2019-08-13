package com.zhibinwang.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 花开
 * @create 2019-08-11 22:56
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient

public class AppConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class,args);
    }
}
