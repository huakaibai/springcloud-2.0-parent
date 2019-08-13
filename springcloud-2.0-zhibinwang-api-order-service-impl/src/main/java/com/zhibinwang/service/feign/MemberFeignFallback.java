package com.zhibinwang.service.feign;

import com.zhibinwang.api.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * @author 花开
 * @create 2019-08-11 23:21
 * @desc
 * hystrix member 服务降级统一处理方法
 **/


@Component //一定要注册到spring中
public class MemberFeignFallback implements IMemberFeign {

    @Override
    public UserEntity getMember(String name) {
        return null;
    }

    @Override
    public String getUserinfo() {
        return "服务降级，统一的服务处理方法";
    }
}
