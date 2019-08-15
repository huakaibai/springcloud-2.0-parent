package com.zhibinwang.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhibin.wang
 * @create 2019-08-15 11:36
 * @desc
 **/
@RestController
@Api( value = "测试Sweggar类")
public class TestController2 {

    @GetMapping("/getRequest")
    @ApiOperation( value = "测试Get请求",notes = "新增之后返回对象")
    @ApiImplicitParam(paramType = "path",name = "name",value = "用户姓名",required = true)
    @ApiResponse(code = 200,message = "随意",response = String.class)
    public  String getRequest(@RequestParam(name = "name")String name){

        return name;

    }
}
