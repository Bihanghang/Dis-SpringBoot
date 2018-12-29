package com.bihang.order.controller;

import com.bihang.order.module.Order;
import com.bihang.order.module.User;
import com.bihang.order.proxy.UserFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created By bihang
 * 2018/12/28 17:47
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeign userFeign;

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/getOrderByFeign")
    public Order getOrderByFeign() {
        User user = userFeign.getUser();
        Order order = new Order(1001, "酸牛奶", user);
        logger.info(order.toString());
        return order;
    }

    @RequestMapping("/getOrder")
    public Order getOrder() {
        User user = restTemplate.getForObject("http://dis-user/user/getUser", User.class);
        Order order = new Order(1001, "酸牛奶", user);
        logger.info(order.toString());
        return order;
    }


}
