package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {

    @GetMapping("/hello")
    public String hello() {
        return "Address Book App Running";
    }
}
