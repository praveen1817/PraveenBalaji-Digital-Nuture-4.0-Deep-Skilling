package com.cognizant.spring_learn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import com.cognizant.spring_learn.DataController.Country;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class countryController {
    Country country1 ;

    @Autowired
    @Qualifier("countryList")
    private List<Country> country;
    private static final Logger logger=LoggerFactory.getLogger(countryController.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country india =(Country)context.getBean("India");
    @GetMapping("/India")
    public Country getCountryIndia(){
        logger.info("Bean Intilaized");
        logger.info("Country Displayed");
        return india;
    }
    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return country;
    }
    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        for (Country cnty : country) {
            if (cnty.getCode().equalsIgnoreCase(code)){
                return cnty;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
    }
}
