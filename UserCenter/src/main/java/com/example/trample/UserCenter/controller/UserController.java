package com.example.trample.UserCenter.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.netflix.client.http.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/12 12:32
 * @Version 1.0
 **/
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getMsg(
            @RequestParam(value = "userName", required = false, defaultValue = "admin") String userName,
            @RequestParam(value = "passWorld", required = false, defaultValue = "passworld") String passWorld
    )throws Exception{
        System.out.println(userName+"/////"+passWorld);

        return "";
    }
}
