 package com.xiangcm.springboot.controller;

 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 /**
 * @ClassName: HelloWordQuickController
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/24 16:01
 * @Description: TODO
 **/
/*@Controller
@ResponseBody*/
@RestController
public class HelloWordQuickController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello word quick!";
    }
}
