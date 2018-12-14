package com.example.trample.Ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author wangxijun
 * @Date 2018/12/13 17:59
 * @Version 1.0
 **/
@Controller
public class ConsumerController {
    //注入负载均衡客户端
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer",method = RequestMethod.POST)
    public String helloConsumer() throws ExecutionException, InterruptedException {
        return restTemplate.getForEntity("http://USER-SERVICE/user-center/hello",String.class).getBody();
    }
}
