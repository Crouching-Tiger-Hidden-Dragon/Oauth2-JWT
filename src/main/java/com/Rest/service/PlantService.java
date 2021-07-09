package com.Rest.service;

import com.Rest.model.MyGarden;
import com.Rest.model.Plant;
import com.Rest.repository.PlantRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlantService implements IPlantService {

    @Autowired
    private PlantRepository plantRepository;

    @Override
    public List<Plant> findAll() {
        return plantRepository.findAll();
    }


}
