package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class HelloController3 {
    //contoh method yang di mapping result page dan diberikan parameter HttpServletRequest dan HttpServletResponse.
    @RequestMapping(path = "/hello3")
    public void hello(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String name = request.getParameter("name");
        response.getWriter().println("hello " + name);
    }
}
