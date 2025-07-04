package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.country;
import com.cognizant.orm_learn.service.countryService;

@SpringBootApplication
public class ormlearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ormlearnApplication.class);
    private static countryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ormlearnApplication.class, args);
        LOGGER.info("Inside main");

        countryService = context.getBean(countryService.class);
        testGetAllCountries();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
}
