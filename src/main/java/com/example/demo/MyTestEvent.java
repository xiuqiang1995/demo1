package com.example.demo;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 */
public class MyTestEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String msg ;

    public MyTestEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}