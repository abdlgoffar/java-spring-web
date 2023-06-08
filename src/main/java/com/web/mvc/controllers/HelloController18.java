package com.web.mvc.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController18 {
    //contoh cara pembuatan session di spring boot.
    @RequestMapping(path = "/hello18", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@RequestParam(name = "password") String password,
                                        HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.setAttribute("infoLogin", password);
        return new ResponseEntity<>(password, HttpStatus.OK);
    }
    //untuk mengambil data value session di spring boot cukup mengunakan annotation @CookieValue.
    @RequestMapping(path = "/hello18/auth", method = RequestMethod.GET)
    public ResponseEntity<String> getCookie(@SessionAttribute(name = "infoLogin") String loginInfo) {
        return new ResponseEntity<>(loginInfo, HttpStatus.OK);
    }
}
//untuk mengetahui test HelloController18 lihat di package test class HelloController18Testing.
