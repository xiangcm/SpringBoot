package com.xiangcm.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/26 23:06
 * @Description: TODO
 **/
@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello"+name;
    }
}
