package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class HelloController4 {
    //contoh cara pembuatan http method, http method biasa dibuat di dalam annotation @RequestMapping seperti contoh dibawah
    @RequestMapping(path = "/hello4", method = RequestMethod.POST)
    public void hello(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String name = request.getParameter("name");
        response.getWriter().println("hello " + name);
    }
}

