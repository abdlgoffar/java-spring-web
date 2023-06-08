package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloController6 {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    @RequestMapping(path = "/hello6")
    public void hello(HttpServletResponse response, @RequestParam(name = "date") Date date) throws IOException {
        //pada response page ini, pada obejct simpleDateFormat.format() membutuhkan data type date sebagai data parameter method format(),
        //sedangkan @RequestParam hanya bisa result value data type String, oleh karena itu data @RequestParam perlu di convert dahulu
        //dari data type String ke Date, untuk melakukan itu lihat di package components class StringToDateConverter.
        response.getWriter().println("hello " + simpleDateFormat.format(date));
    }
    //untuk mengetahui test HelloController6 lihat di package test class HelloController6Testing.
}
