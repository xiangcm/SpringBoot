package com.xiangcm.springboot.springboot02config02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloWordController
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/29 22:02
 **/
@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }
}
