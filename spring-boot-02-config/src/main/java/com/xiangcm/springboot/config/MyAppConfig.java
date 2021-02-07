package com.xiangcm.springboot.config;

import com.xiangcm.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyAppConfig
 * @Description: 配置类
 * ***@Configuration // 表明该类是配置类，用于替代Spring配置文件
 * 在配置文件中使用<bean></bean>标签添加组件
 * @Author: DELL
 * @Date: 2021/1/26 23:30
 **/
@Configuration // 表明该类是配置类，用于替代Spring配置文件
public class MyAppConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("配置类用@Bean注解给容器添加组件。。。");
        return new HelloService();
    }
}
