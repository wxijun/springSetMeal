package com.example.trample.eurekaserverspare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSpareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSpareApplication.class, args);
	}

}

