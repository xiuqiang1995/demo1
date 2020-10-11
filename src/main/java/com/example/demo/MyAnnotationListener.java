package com.example.demo;


import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationListener {

    @EventListener
    public void listener1(MyTestEvent event) {
        // 业务处理
        System.out.println("注解监听器1:" + event.getMsg());
    }

    @EventListener
    @Async
    public void listener2(MyTestEvent event) {
        // 异步执行业务处理
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("注解监听器2:" + event.getMsg());
    }
}
