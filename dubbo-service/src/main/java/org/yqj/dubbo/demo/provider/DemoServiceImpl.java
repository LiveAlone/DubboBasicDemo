package org.yqj.dubbo.demo.provider;

import org.yqj.dubbo.demo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yaoqijun on 2018-01-31.
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
//        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
//        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
        return null;
    }
}
