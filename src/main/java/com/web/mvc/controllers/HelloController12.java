package com.web.mvc.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
public class HelloController12 {
    //contoh cara upload file, cukup  menggunakan annotation @RequestPart dengan data type MultipartFile, seperti contoh di bawah.
    @RequestMapping(path = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE  )
    @ResponseBody
    public String hello(@RequestPart(name = "img") MultipartFile multipartFile) throws IOException {
        Path path = Path.of("C:/programming/java/course/java-spring-web/file-uploaded/" + multipartFile.getOriginalFilename());
        Path write = Files.write(path, multipartFile.getBytes());
        return "successfully uploaded file";
    }
}
//untuk mengetahui test HelloController12 lihat di package test class HelloController12Testing.
