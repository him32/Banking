package com.archiee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.archiee.repo.MListRepository;

@SpringBootApplication
@EnableEurekaClient
public class SpringJpaPostgreSqlApplication implements CommandLineRunner{

	

	@Autowired
	MListRepository repository1;
	
	public static void main(String[] args){
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		
	}

}
