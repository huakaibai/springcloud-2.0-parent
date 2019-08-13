package com.zhibinwang.service.feign;

import com.zhibinwang.api.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 花开
 * @create 2019-08-09 0:06
 * @desc
 **/
@FeignClient(name = "app-itmayiedu-member",fallback = MemberFeignFallback.class)
public interface IMemberFeign extends IMemberService {
}
