package com.web.mvc.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//contoh cara pembuatan request form value.
@Controller
public class HelloController10 {
    @RequestMapping(path = "/hello10", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String hello(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "address") String address) {
        return "my name is " + name + " address " + address;
    }
}
//untuk mengetahui test HelloController10 lihat di package test class HelloController10Testing.
