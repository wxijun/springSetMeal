package com.example.trample.springcloudconfigclinent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClinetApplication.class, args);
	}

}

