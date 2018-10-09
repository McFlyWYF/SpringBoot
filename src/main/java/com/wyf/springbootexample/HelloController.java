package com.wyf.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController         //外部访问加
@RequestMapping("/hello")                         //给类添加访问方法
public class HelloController {

/*
@Value单个配置文件的注入
 */

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")//单个属性
//    private Integer age;
//
//    @Value("${content")//属性调用属性
//    private String content;

    @Autowired//把配置写入到一个类中
    private GirlProperties girlProperties;


    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)//使用GET方法，通过127.0.0.1:8080/hello访问
    public String say(){
        return girlProperties.getCupSize();
    }

}
