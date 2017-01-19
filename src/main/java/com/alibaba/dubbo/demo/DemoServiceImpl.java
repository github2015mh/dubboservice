package com.alibaba.dubbo.demo;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/17.
 */
//@Service("demoServiceLocal")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
