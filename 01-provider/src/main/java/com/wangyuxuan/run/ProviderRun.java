package com.wangyuxuan.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wangyuxuan
 * @date 2020/7/27 11:08 下午
 * @description
 */
public class ProviderRun {
    public static void main(String[] args) throws IOException {
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-provider.xml");
        // 启动Spring容器
        ((ClassPathXmlApplicationContext) ac).start();
        // 使主线程阻塞
        System.in.read();
    }
}
