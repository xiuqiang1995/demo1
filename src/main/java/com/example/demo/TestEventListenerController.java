package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestEventListenerController {

    @Autowired
    private MyTestEventPubLisher publisher;

    @RequestMapping(value = "/test/testPublishEvent1" )
    @ResponseBody
    public void testPublishEvent(){
        publisher.pushListener("我来了！");
    }
}