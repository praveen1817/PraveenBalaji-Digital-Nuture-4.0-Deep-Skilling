package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
	public static final Logger LOGGER =LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
			LOGGER.info("Main Method in Started");
			SpringApplication.run(SpringLearnApplication.class, args);
			LOGGER.info("Main Method is Ended");
		}
		
	}


