package com.zhibinwang.service.impl;

import com.itmayiedu.base.BaseApiService;
import com.itmayiedu.base.ResponseBase;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhibinwang.api.entity.UserEntity;
import com.zhibinwang.service.IOrderService;
import com.zhibinwang.service.feign.IMemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 花开
 * @create 2019-08-09 0:08
 * @desc
 **/
@RestController
public class OrderSeriviceImpl extends BaseApiService implements IOrderService {

    @Autowired
    private IMemberFeign memberFeign;

    @Override
    @RequestMapping("/getOrder")
    public  String getOrder( @RequestParam(value = "name") String name){

        UserEntity member = memberFeign.getMember(name);

        return member == null ?"会员为空":member.getName();
    }

    @RequestMapping("/orderToMemberHystrix")
    @HystrixCommand(fallbackMethod = "orderToMemberFallBack")
    /**
     * HystrixCommand 具有开启服务降级，服务熔断，服务隔离的功能
     * 服务隔离默认是线程池隔离
     * 熔断阈值默认应该是10 ，没记错的话
     *
     */
    public ResponseBase orderToMemberHystrix(){
        System.out.println("当前线程池名称"+Thread.currentThread().getName());
        memberFeign.getUserinfo();
       return setResultSuccess();
    }

    public  ResponseBase orderToMemberFallBack(){

       return setResultError("服务降级，服务繁忙请稍后再试");
    }

    @RequestMapping("/orderTomemebrTongyi")
    public String orderTomemebrTongyi(){
        System.out.println(Thread.currentThread().getName());
        memberFeign.getUserinfo();
        throw  new RuntimeException("yichang");
       // return setResultSuccess().toString();
    }

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        System.out.println(Thread.currentThread().getName());
        return "没有使用hystrix";
    }
}
