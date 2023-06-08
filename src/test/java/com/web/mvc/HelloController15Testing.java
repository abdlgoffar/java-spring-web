package com.web.mvc;


import jakarta.servlet.http.Cookie;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloController15Testing {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void controllerTest() throws Exception {
        this.mockMvc.perform(
                get("/hello15")
                        .param("password", "goffar123")

        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("goffar123")),
                cookie().value("loginInfo", Matchers.is("goffar123")));
    }

    @Test
    void getCookieTest() throws Exception {
        this.mockMvc.perform(
                get("/hello15/auth")
                        .cookie(new Cookie("loginInfo", "goffar123"))

        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("goffar123")));
    }
}