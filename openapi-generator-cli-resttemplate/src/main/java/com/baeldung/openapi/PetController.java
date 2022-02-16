package com.baeldung.openapi;

import com.baeldung.openapi.api.PetApi;
import com.baeldung.openapi.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PetController {

    @Autowired
    PetApi petApi;

    @GetMapping("/pets")
    public List<Pet> pets(){
        return petApi.findPetsByStatus(Arrays.asList("sold"));
    }
}
