package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
public class HelloController9 {
    //contoh cara pembuatan http request header.
    @RequestMapping(path = "/hello9")
    public void hello(HttpServletResponse response, @RequestHeader(name = "authorization", value = HttpHeaders.AUTHORIZATION) String auth) throws IOException {
        response.getWriter().println(auth);
    }
    //untuk mengetahui test HelloController9 lihat di package test class HelloController9Testing.
}