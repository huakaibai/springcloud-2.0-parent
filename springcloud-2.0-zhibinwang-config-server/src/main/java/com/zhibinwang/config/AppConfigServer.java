package com.zhibinwang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 花开
 * @create 2019-08-11 22:44
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AppConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }
}
