package com.zhibinwang.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 花开
 * @create 2019-08-09 0:02
 * @desc
 **/
public interface IOrderService {

    @RequestMapping("/getOrder")
    String getOrder(@RequestParam("name") String name);
}
