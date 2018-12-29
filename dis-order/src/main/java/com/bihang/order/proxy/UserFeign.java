package com.bihang.order.proxy;

/**
 * Created By bihang
 * 2018/12/29 9:41
 */

import com.bihang.order.module.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "dis-user")
public interface UserFeign {

    @RequestMapping("/user/getUser")
    User getUser();

}
