package com.babyfeed.managementservice.controller;

import com.babyfeed.managementservice.repository.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("babies")
public class BabyController {

    @Autowired
    private BabyRepository repository;

    @GetMapping
    public String allBabies(){
        return "Get all babies working fine";
    }

}
