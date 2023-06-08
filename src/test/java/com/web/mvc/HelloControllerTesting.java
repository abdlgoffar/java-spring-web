package com.web.mvc;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//contoh cara pembuatan mock mvc unit test.
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTesting {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void controller2Test() throws Exception {
        this.mockMvc.perform(
                get("/hello2")
        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("hello abdul goffar")));
    }

    @Test
    void controller3Test() throws Exception {
        this.mockMvc.perform(
                get("/hello3").queryParam("name", "goffar")
        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("hello goffar")));
    }
}
