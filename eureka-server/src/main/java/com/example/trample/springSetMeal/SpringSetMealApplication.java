package com.example.trample.springSetMeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringSetMealApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSetMealApplication.class, args);
	}
}
