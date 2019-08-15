package com.zhibinwang.service.impl;

import com.zhibinwang.api.entity.UserEntity;
import com.zhibinwang.api.service.IMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 花开
 * @create 2019-08-08 23:51
 * @desc
 **/
@RestController
@Api("Memmber使用类")
public class MemberServiceImpl implements IMemberService {


    @Value("${server.port}")
    private String port;

    @PostMapping("/getMember")
    @ApiOperation(value = "获取会员")
    @ApiImplicitParam(paramType = "path",name = "name",value = "用户姓名",required = true)
    public UserEntity getMember( @RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(11);
        System.out.println(port);
        return userEntity;
    }

    @GetMapping("/getUserinfo")
    @ApiOperation(value = "获取用户信息")
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
