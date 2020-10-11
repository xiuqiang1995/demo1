package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义监听器
 */
@Component
public class MyNoAnnotationListener implements ApplicationListener<MyTestEvent> {

    @Override
    public void onApplicationEvent(MyTestEvent event) {
        // 业务处理代码
        System.out.println("非注解监听器：" + event.getMsg());
    }

}