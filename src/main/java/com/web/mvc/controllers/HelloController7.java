package com.web.mvc.controllers;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController7 {

    //contoh cara pembuatan request content type, cukup dengan memberi parameter consumes pada annotation @RequestMapping.
    @RequestMapping(path = "/hello7", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String hello() {
        return "hello";
    }
    //untuk mengetahui test HelloController7 lihat di package test class HelloController7Testing.
}