package com.cognizant.spring_learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {
    private static final Logger logger= LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String sayHello(){
        logger.info("controller is called");
        logger.info("The Controller Process in ended");
        return "Hello World!!";
    }
}
