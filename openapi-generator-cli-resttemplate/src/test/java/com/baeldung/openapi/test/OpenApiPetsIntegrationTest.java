package com.baeldung.openapi.test;

import com.baeldung.openapi.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@Slf4j
@AutoConfigureMockMvc
@SpringBootTest(classes = Application.class)
public class OpenApiPetsIntegrationTest {
    private static final String PETS_PATH = "/pets/";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenReadAll_thenStatusIsNotImplemented() throws Exception {
        this.mockMvc.perform(get(PETS_PATH)).andReturn().getResponse().getContentAsString();
        this.mockMvc.perform(get(PETS_PATH)).andExpect(status().isNotImplemented());
    }

    @Test
    public void whenReadOne_thenStatusIsNotImplemented() throws Exception {
        this.mockMvc.perform(get(PETS_PATH + 1)).andExpect(status().isNotImplemented());
    }
}