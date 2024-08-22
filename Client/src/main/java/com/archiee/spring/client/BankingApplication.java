package com.archiee.spring.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.archiee.spring.client.model.MList;
import com.archiee.spring.client.model.passbook;

@SpringBootApplication
@EnableEurekaClient
public class BankingApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	@Bean
	public MList mList() {
		return new MList();
	}

	@Bean
	public passbook passupdate() {
		return new passbook();
	}

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}
}
