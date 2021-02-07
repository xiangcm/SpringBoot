package com.xiangcm.springboot;

import com.xiangcm.springboot.bean.Person;
import com.xiangcm.springboot.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author xiangcm
 * @Description springboot 单元测试
 * @Date 18:18 2021/1/24
 * @Param
 * @return
**/
//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void testHelloService() {
        boolean containsFlag = ioc.containsBean("helloService");
        System.out.println(containsFlag);
    }

}
