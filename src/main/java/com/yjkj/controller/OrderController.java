package com.yjkj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bin on 2019/1/17.
 */
@RestController
@RequestMapping("/order/")
public class OrderController {
    @RequestMapping("/findState")
    public String findState(String orderNo){
        return orderNo;
    }
    @RequestMapping("/test1")
    public String test(String orderNo){
        System.out.println("test");
        return orderNo;
    }
}
