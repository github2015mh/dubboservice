package com.alibaba.dubbo.demo;

/**
 * Created by Administrator on 2017/1/20.
 */
public abstract class DemoServiceStub implements DemoService {

    private final DemoService demoService;

    public DemoServiceStub(DemoService demoService){
        System.out.println("init "+this.getClass().getName()+"************");
        this.demoService = demoService;
    }

    //服务端写stub的实现没有用，不会被执行。但是需要stub类和带参数构造方法
    //调用的是客户端定义的stub
//    @Override
//    public String sayHello(String name) {
//        System.out.println(this.getClass().getName()+"------------------");
//        if(name!=null&&!name.equals("ffp")){
//            try{
//                return demoService.sayHello(name);
//            }catch (Exception e){
//                e.printStackTrace();
//                return "nonono，error<br>"+e.getMessage();
//            }
//        }
//        return "福福福provider";
//    }
}
