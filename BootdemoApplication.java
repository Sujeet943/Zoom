package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.bootdemo.controller")

@EntityScan(basePackages = "com.example.bootdemo.dto") //use to specify package name for our entity class
@EnableJpaRepositories(basePackages = "com.example.bootdemo.reposetory")// use to specify package name for our repository
public class BootdemoApplication { 

	public static void main(String[] args) {
		SpringApplication.run(BootdemoApplication.class, args);
	}

}
