package com.zhibinwang.service.impl;

import com.zhibinwang.api.entity.UserEntity;
import com.zhibinwang.api.service.IMemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 花开
 * @create 2019-08-08 23:51
 * @desc
 **/
@RestController
public class MemberServiceImpl implements IMemberService {


    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMember")
    public UserEntity getMember( @RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(11);
        System.out.println(port);
        return userEntity;
    }

    @RequestMapping("/getUserinfo")
    public String getUserinfo() {
        System.out.println("getUserInfo");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "orderT oMember 成功";
    }
}
