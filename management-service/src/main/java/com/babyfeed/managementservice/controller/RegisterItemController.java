package com.babyfeed.managementservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RegisterItemController {

    @RequestMapping("/items")
    public String[] getAllItems(){
        return new String[]{"Fralda", "Coco", "Feed", "120ml leite"};
    }

    @RequestMapping("/items/id")
    public String[] getItemById(){
        return new String[]{"Feed", "120ml leite"};
    }
}
