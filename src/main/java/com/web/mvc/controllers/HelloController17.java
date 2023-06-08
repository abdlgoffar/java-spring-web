package com.web.mvc.controllers;

import com.web.mvc.helpers.RequestParamUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController17 {
    //contoh cara pembuatan model attribute.
    @RequestMapping(path = "/hello17")
    @ResponseBody
    public ResponseEntity<String> hello(@RequestParam(name = "name") String name) {
        if (name.equals("goffar")) {
            throw new NullPointerException();
        }
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
