package com.inet.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.inet.controller", "com.inet.service", "com.inet.repository", "com.inet.config"})
@EnableJpaRepositories("com.inet.repository")
@EntityScan("com.inet.entity")
@SpringBootApplication
public class MicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceApplication.class, args);
	}

}
