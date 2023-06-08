package com.web.mvc.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController8 {

    //contoh cara pembuatan response content type, cukup dengan memberi parameter produce pada annotation @RequestMapping.
    @RequestMapping(path = "/hello8", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String hello() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>$name</title>
                </head>
                <body>
                                
                </body>
                </html>
                """ .replace("name", "abdul goffar east java");
    }
    //untuk mengetahui test HelloController8 lihat di package test class HelloController8Testing.
}