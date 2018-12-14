package com.example.trample.UserCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/14 10:07
 * @Version 1.0
 **/
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String hello(){
        return  "hello1";
    }
}
