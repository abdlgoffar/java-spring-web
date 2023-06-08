package com.web.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//contoh cara pembuatan path variable, cukup menambahkan annotation @PathVariable.
@Controller
public class HelloController11 {
    @RequestMapping(path = "/hello11/{name}")
    @ResponseBody
    public String hello(@PathVariable(name = "name") String name) {
        return name;
    }
}
//untuk mengetahui test HelloController11 lihat di package test class HelloController11Testing.
