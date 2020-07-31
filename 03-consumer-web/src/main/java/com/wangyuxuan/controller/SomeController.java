package com.wangyuxuan.controller;

import com.wangyuxuan.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangyuxuan
 * @date 2020/7/31 9:17 下午
 * @description
 */
@Controller
public class SomeController {

    @Autowired
    private SomeService service;

    @RequestMapping("/some.do")
    public String someHandle() {
        String result = service.hello("China");
        System.out.println("消费者端接收到 = " + result);
        return "/welcome.jsp";
    }
}
