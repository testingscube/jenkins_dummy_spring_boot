package com.scubetesting.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringBootApplication {
	private static final Logger log = LoggerFactory.getLogger(JenkinsSpringBootApplication.class);

	public static void main(String[] args) {
		log.info("AAA Application executed!");
		SpringApplication.run(JenkinsSpringBootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		log.info("AAA from the init post construct!");
	}
}
