package com.cognizant.spring_learn;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Inside the Main Method");
        displayInfo();
        LOGGER.info("Main Method is Off");
    }

    public static void displayInfo() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country)context.getBean("country", Country.class);
        LOGGER.debug("Inside the Country Class Displaying the Method: {}", country.toString());
        System.out.println("Inside the Country Class Displaying the Method: {}"+country);
        context.close();
    }
}



