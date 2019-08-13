package com.zhibinwang.api.service;

import com.zhibinwang.api.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 花开
 * @create 2019-08-08 23:45
 * @desc
 **/
public interface IMemberService {


    @RequestMapping("/getMember")
    UserEntity getMember(@RequestParam(value = "name") String name);

    @RequestMapping("getUserinfo")
    String getUserinfo();
}
