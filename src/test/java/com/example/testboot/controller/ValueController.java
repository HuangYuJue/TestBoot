package com.example.testboot.controller;

import com.example.testboot.entity.ValueEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class ValueController {

    @Autowired
    private ValueEntity valueEntity;

    @PostConstruct
    public void postConstruct() {
        System.out.println("context：" + valueEntity +"--->name：" + valueEntity.getName() + ", age：" + valueEntity.getAge() + ", info：" + valueEntity.getInfo());
    }

/*    @Value("${context.name}")
    private String CONTEXT_NAME;

    @Value("${context.age}")
    private int CONTEXT_AGE;

    @Value("${context.info}")
    private String CONTEXT_INFO;

    @PostConstruct
    public void getValue() {
        System.out.println("name：" + CONTEXT_NAME + ", age：" + CONTEXT_AGE + ", info：" + CONTEXT_INFO);
    }*/
    // 被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器调用一次，类似于Serclet的init()方法
    // 被@PostConstruct注解的方法将在该类中所有注入操作完成之后执行
}
