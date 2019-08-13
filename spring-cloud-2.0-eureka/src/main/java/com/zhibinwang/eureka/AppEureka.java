package com.zhibinwang.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 花开
 * @create 2019-08-07 20:17
 * @desc Eureka 服务注册中心启动类
 **/
@EnableEurekaServer
@SpringBootApplication
public class AppEureka {

    public static void main(String... args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
