package com.fsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProdutoApplication.class, args);
	}

}
