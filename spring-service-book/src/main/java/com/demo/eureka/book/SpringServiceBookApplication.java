package com.demo.eureka.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringServiceBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceBookApplication.class, args);
	}

}
