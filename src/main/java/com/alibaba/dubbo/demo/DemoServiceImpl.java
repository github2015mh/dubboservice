package com.alibaba.dubbo.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/17.
 */
//@Service("demoServiceLocal")
public class DemoServiceImpl implements DemoService {
    @Override
    public Map sayHello(String name) {
        System.out.println("server "+this.getClass().getName()+" sayHello executing");
        Map<String,Object> ret = new HashMap<>();
        ret.put("data","hello "+name);
        ret.put("retCode","0002");
        ret.put("retMsg", "succ");
        return ret;
    }
}
