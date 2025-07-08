package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private String countryName;
    private String countryCode;

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public Country() {
    	System.out.println(">>> Inside Country Constructor <<<");
        LOGGER.debug("Inside the Country Constructor");
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return "Country [countryName=" + countryName + ", countryCode=" + countryCode + "]";
    }
}
