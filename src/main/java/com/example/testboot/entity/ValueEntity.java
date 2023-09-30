package com.example.testboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data   // getter/setter/toString不用手写
@Component  // 将该对象交给Spring管理
@ConfigurationProperties(prefix = "context")    // 将properties文件注入该JavaBean
public class ValueEntity {
    private String name;
    private int age;
    private String info;
}