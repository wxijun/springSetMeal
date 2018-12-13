package com.example.trample.springcloudconfigclinent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/13 14:44
 * @Version 1.0
 **/
@RestController
//这里面的属性有可能会更新的，git中的配置中心变化的话就要刷新，没有这个注解内，配置就不能及时更新
@RefreshScope
public class TestController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private Integer age;
//
//    @RequestMapping("/test")
//    public String test(){
//        return this.name+this.age;
//    }
}
