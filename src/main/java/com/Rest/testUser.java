package com.Rest;

import com.Rest.model.Plant;
import com.Rest.repo.PlantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testUser {

    @Autowired
    PlantRepo plantRepo;


    @GetMapping("/getPlant")
    public List<Plant> getAll(){
        return plantRepo.findAll();

    }
}
