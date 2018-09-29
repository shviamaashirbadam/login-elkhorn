package com.elkhorn;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableEurekaClient
public class driver {
	final static Logger logger = Logger.getLogger(driver.class);
	public static void main(String[] args) {
		logger.info("This is driver class");
		SpringApplication.run(driver.class, args);

	}
}
