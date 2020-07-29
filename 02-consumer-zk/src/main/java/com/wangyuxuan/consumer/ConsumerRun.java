package com.wangyuxuan.consumer;

import com.wangyuxuan.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangyuxuan
 * @date 2020/7/29 11:31 下午
 * @description
 */
public class ConsumerRun {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
        SomeService service = (SomeService) ac.getBean("someService");
        String hello = service.hello("China");
        System.out.println(hello);
    }
}
