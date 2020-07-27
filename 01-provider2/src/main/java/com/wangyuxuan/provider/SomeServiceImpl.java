package com.wangyuxuan.provider;

import com.wangyuxuan.service.SomeService;

/**
 * @author wangyuxuan
 * @date 2020/7/27 11:15 下午
 * @description
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println(name + "，我是提供者");
        return "Hello Dubbo World! " + name;
    }
}
