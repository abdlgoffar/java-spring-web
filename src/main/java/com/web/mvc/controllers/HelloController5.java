package com.web.mvc.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.io.IOException;

@Controller
public class HelloController5 {
    //contoh pembuatan request param menggunakan annotaion @requestParam, parameter name adalah nama parameternya nanti di url,
    //parameter required adalah persyaratannya jika true wajib jika false tidak wajib.
    @RequestMapping(path = "/hello5")
    public void hello(HttpServletResponse response, @RequestParam(name = "name", required = true) String name) throws IOException {
        response.getWriter().println("hello " + name);
    }
}