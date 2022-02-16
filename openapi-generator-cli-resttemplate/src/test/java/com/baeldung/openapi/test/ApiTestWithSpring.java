package com.baeldung.openapi.test;


import com.baeldung.openapi.api.PetApi;
import com.baeldung.openapi.model.Pet;
import com.baeldung.openapi.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@Slf4j
@AutoConfigureMockMvc
@SpringBootTest(classes = Application.class)
public class ApiTestWithSpring {

    @Autowired
    PetApi petApi;

    @Test
    public void test1(){
        List<Pet>  pets = petApi.findPetsByStatus(Arrays.asList("sold"));
        System.out.println(pets);
    }
}
