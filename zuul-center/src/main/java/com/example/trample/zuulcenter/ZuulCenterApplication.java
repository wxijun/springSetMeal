package com.example.trample.zuulcenter;

import com.example.trample.zuulcenter.zuul.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulCenterApplication.class, args);
	}

	@Bean
	public TokenFilter tokrnFilter(){
		return new TokenFilter();
	}
}
