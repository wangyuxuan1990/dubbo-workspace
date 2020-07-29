package com.wangyuxuan.provider;

import com.wangyuxuan.service.SomeService;

/**
 * @author wangyuxuan
 * @date 2020/7/29 11:17 下午
 * @description
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("执行提供者的hello() " + name);
        return "hello, " + name;
    }
}
