package com.zhibinwang.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author 花开
 * @create 2019-08-13 21:42
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
@EnableZuulProxy
public class AppZuul {

    public static void main(String[] args) {
        SpringApplication.run(AppZuul.class,args);
    }
}
