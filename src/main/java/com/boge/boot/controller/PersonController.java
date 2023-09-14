package com.boge.boot.controller;

import com.boge.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private Person person;

    @GetMapping("/query")
    public Person query() {
        return person;
    }
}
