package com.web.mvc;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//contoh di bawah adalah cara pembuatan integration test di spring web.
//untuk object melakukan integration test adalah object yang bernama  org.springframework.boot.test.web.client.TestRestTemplate
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTesting {
    @Autowired
    private TestRestTemplate testRestTemplate;//object unit test
    @LocalServerPort
    private Integer port;//port random untuk melakuakan integration test web

    @Test
    void controller2Test() throws Exception {
        String body = testRestTemplate.getForEntity("http://localhost:" + port + "/hello2", String.class)
                .getBody();
        Assertions.assertNotNull(body);
        Assertions.assertEquals("hello abdul goffar", body.trim());
    }

    @Test
    void controller3Test() throws Exception {
        String body = testRestTemplate.getForEntity("http://localhost:" + port + "/hello3?name=goffar", String.class)
                .getBody();
        Assertions.assertNotNull(body);
        Assertions.assertEquals("hello goffar", body.trim());
    }
}
