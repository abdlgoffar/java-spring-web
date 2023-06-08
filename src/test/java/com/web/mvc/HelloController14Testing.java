package com.web.mvc;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloController14Testing {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void loginSuccess() throws Exception {
        this.mockMvc.perform(
                post("/hello14")
                        .param("password", "goffar123")

        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("login success")));
    }
    @Test
    void loginFailed() throws Exception {
        this.mockMvc.perform(
                post("/hello14")
                        .param("password", "goffar1235678910")

        ).andExpectAll(
                status().isUnauthorized(),
                content().string(Matchers.containsString("login failed")));
    }
}
