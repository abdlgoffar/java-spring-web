package com.web.mvc;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloController12Testing {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void controllerTest() throws Exception {
        //pada data constructor object MockMultipartFile() parameter 1 adalah name dari annotation @RequestPart, 2 adalah nama file yang akan di upload,
        //3 adalah content type nya, 4 sumber file di upload secara detail seperti contoh di bawah.
        this.mockMvc.perform(
                multipart("/upload")
                        .file(new MockMultipartFile(
                                "img",
                                "view-and-computer.jpg",
                                "image/jpg",
                                getClass().getResourceAsStream("/Pictures/view-and-computer.jpg")))
                        .contentType(MediaType.MULTIPART_FORM_DATA)
        ).andExpectAll(
                status().isOk(),
                content().string(Matchers.containsString("successfully uploaded file")));
    }
}