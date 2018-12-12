package com.example.trample.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName eurekaClientController
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/12 16:53
 * @Version 1.0
 **/
@Controller
public class EurekaClientController {

    @RequestMapping(value = "/get/{a}/{b}",method = RequestMethod.GET)
    public String getMsg(@PathVariable Integer a, @PathVariable Integer b){
        System.out.println(a+b);
        return "";
    }
}
