package com.web.mvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController14 {
    //contoh cara pembuatan method
    @RequestMapping(path = "/hello14", method = RequestMethod.POST)
    public ResponseEntity<String> hello(@RequestParam(name = "password") String password) {
        if (password.equals("goffar123")) {
            return new ResponseEntity<>("login success", HttpStatus.OK);
        }
        return new ResponseEntity<>("login failed", HttpStatus.BAD_REQUEST);
    }
}
//untuk mengetahui test HelloController14 lihat di package test class HelloController14Testing.