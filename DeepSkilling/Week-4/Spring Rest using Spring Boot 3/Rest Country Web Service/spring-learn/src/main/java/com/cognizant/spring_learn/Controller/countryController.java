package com.cognizant.spring_learn.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import com.cognizant.spring_learn.DataController.Country;

@RestController
public class countryController {
    private Country reference;
    private static final Logger logger=LoggerFactory.getLogger(countryController.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country india =(Country)context.getBean("India");
    @GetMapping("/India")
    public Country getCountryIndia(){
        logger.info("Bean Intilaized");
        logger.info("Country Displayed");
        return india;
    }
}
