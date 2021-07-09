package com.Rest.service;

import com.Rest.model.MyGarden;
import com.Rest.model.Plant;
import java.util.List;
import java.util.Optional;

public interface IPlantService {
    List<Plant> findAll();
}
