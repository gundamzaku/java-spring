package com.tantanwen.kafka.controller;


import com.tantanwen.kafka.common.Foo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TanTanWenController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/getKafaInfo")
    public void getKafaInfo() {
        ListenableFuture res = this.kafkaTemplate.send("topic.quick.demo", "this is my first demo");
        System.out.println(res);
        //this.template.send("topic1", new Foo1(what));
    }

    /*
       @RequestMapping("/greetingList")
       public ResultMessage<List<User>> greetingList(@RequestParam(value="name", defaultValue="World") String name) {

           //PageHelper.startPage(1, 10);
           List<User> list = userService.SelAll();
           return ResultMessage.success(list);
       }*/
}