package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class HelloController2 {
    @RequestMapping(path = "/hello2", method = RequestMethod.GET)//contoh cara pembuatan annotation request mapping.
    public void hello(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello abdul goffar");
    }
}
