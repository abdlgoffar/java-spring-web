package com.web.mvc.controllers;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController15 {
    //contoh cara pembuatan cookie, cookie di spring boot.
    @RequestMapping(path = "/hello15", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@RequestParam(name = "password") String password,
                                        HttpServletResponse response) {
        Cookie cookie = new Cookie("loginInfo", password);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new ResponseEntity<>(password, HttpStatus.OK);
    }
    //untuk mengambil data value cookie di spring boot cukup mengunakan annotation @CookieValue.
    @RequestMapping(path = "/hello15/auth", method = RequestMethod.GET)
    public ResponseEntity<String> getCookie(@CookieValue("loginInfo") String loginInfo) {
        return new ResponseEntity<>(loginInfo, HttpStatus.OK);
    }
}
//untuk mengetahui test HelloController15 lihat di package test class HelloController15Testing.