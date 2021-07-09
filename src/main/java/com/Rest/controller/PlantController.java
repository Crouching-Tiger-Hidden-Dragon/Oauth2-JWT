package com.Rest.controller;

import com.Rest.Exception.ResourceNotFoundException;
import com.Rest.model.MyGarden;
import com.Rest.model.Plant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.Rest.service.IMyGardenService;
import com.Rest.service.IPlantService;
import com.Rest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PlantController {
    @Autowired
    private IPlantService plantService;

    @Autowired
    private IMyGardenService gardenService;

    @Autowired
    private IUserService userService;

    @GetMapping("/getAllPlants")
    private List<Plant> getAllPlants()
    {
        return plantService.findAll();
    }

    @DeleteMapping("/removePlant/{id}")
    private Map<String, Boolean> removePlant(@PathVariable("id") long id, HttpServletRequest request) throws Exception
    {
//        MyGarden plant = gardenService.findByPlantId(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Plant not found on :: "+ id));

        String userName = (String) request.getAttribute("userName");
        gardenService.deletePlant(getUserId(userName), id);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    private long getUserId(String userName){
        return userService.findByUserName(userName);
    }
}
