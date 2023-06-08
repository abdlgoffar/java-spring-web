package com.web.mvc;

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
public class HelloController16Testing {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void controllerTest() throws Exception {
        this.mockMvc.perform(
                get("/hello16")
                        .param("firstName", "abdul")
                        .param("middleName", "goffar")
                        .param("lastName", "supriyadi")
                        .param("address.street", "jl. jaksa agung suprapto")
                        .param("address.city", "sampang")
        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("abdul goffar supriyadi jl. jaksa agung suprapto sampang")));
    }
}