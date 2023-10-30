package com.babyfeed.managementservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RegisterItemController {

    @RequestMapping("/items")
    public String[] getAllItems(){
        return new String[]{"Fralda", "Coco", "Formula", "120ml"};
    }

    @RequestMapping("/items/id")
    public String[] getItemById(){
        return new String[]{"Formula", "120ml"};
    }
}
