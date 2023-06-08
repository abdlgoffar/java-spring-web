package com.web.mvc;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloController10Testing {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void controllerTest() throws Exception {
        this.mockMvc.perform(
                post("/hello10")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("name", "goffar")
                        .param("address", "pliyang")
        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("my name is goffar address pliyang")));
    }
}