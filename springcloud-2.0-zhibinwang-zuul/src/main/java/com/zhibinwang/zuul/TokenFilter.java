package com.zhibinwang.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 花开
 * @create 2019-08-13 22:10
 * @desc zuulFileter
 **/
@Component
public class TokenFilter extends ZuulFilter {


    // 判断过滤器是否生效
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public String filterType() {
        // 在进行Zuul过滤的时候可以设置其过滤执行的位置，那么此时有如下几种类型：
        // 1、pre：在请求发出之前执行过滤，如果要进行访问，肯定在请求前设置头信息
        // 2、route：在进行路由请求的时候被调用；
        // 3、post：在路由之后发送请求信息的时候被调用；
        // 4、error：出现错误之后进行调用
        return "pre";
    }

    // 过滤器的执行顺序。当请求在一个阶段的时候存在多个多个过滤器时，需要根据该方法的返回值依次执行
    @Override
    public int filterOrder() {
        // 数字越大优先级越高
        return 0;
    }

    @Override
    public Object run() throws ZuulException {
    //表示过滤操作

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String userToken = request.getParameter("userToken");
        if (StringUtils.isEmpty(userToken)){
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("userToken is null");
            return null;
        }

        return null;
    }
}
