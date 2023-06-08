package com.web.mvc.controllers;


import com.web.mvc.helpers.RequestParamUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController16 {
    //contoh cara pembuatan model attribute.
    @RequestMapping(path = "/hello16")
    @ResponseBody
    public String hello(@ModelAttribute RequestParamUser user) {
        return new StringBuilder()
                .append(user.getFirstName())
                .append(" ")
                .append(user.getMiddleName())
                .append(" ")
                .append(user.getLastName())
                .append(" ")
                .append(user.getAddress().getStreet())
                .append(" ")
                .append(user.getAddress().getCity())
                .toString();
    }
}
//untuk mengetahui test HelloController16 lihat di package test class HelloController16Testing.