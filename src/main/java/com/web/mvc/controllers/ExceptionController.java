package com.web.mvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//contoh cara pembuatan advice controller.
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> error() {
        return new ResponseEntity<>("there error", HttpStatus.BAD_REQUEST);
    }
}
//untuk mengetahui hasil pengetesan controller advice ini lihat di package test class HelloController17Testing.
