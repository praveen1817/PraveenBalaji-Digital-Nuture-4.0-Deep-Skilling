package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.orm_learn.model.country;
import com.cognizant.orm_learn.repository.countryRepository;

@Service
public class countryService {

    @Autowired
    private countryRepository countryRepository;

    @Transactional
    public List<country> getAllCountries() {
        return countryRepository.findAll();
    }
}
