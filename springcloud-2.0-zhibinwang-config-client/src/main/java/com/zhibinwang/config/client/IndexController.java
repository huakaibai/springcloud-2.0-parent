package com.zhibinwang.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 花开
 * @create 2019-08-11 22:55
 * @desc
 **/
@RestController
@RefreshScope // 注意开启配置文件刷新功能
public class IndexController {

    @Value("${test.aa}")
    private String name;


    @RequestMapping("/getName")
    private String getName(){
        return name;
    }
}
