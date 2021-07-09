package com.Rest.service;


import java.util.List;
import com.Rest.model.MyGarden;
import com.Rest.repository.MyGardenRepository;

import java.util.List;
import java.util.Optional;

public interface IMyGardenService {
    void deletePlant(long gardenId);
    void add(long userId, long plantId);
    MyGarden findByPlantId(long userId, long plantId);
    List<MyGardenRepository.MyGardenDetail> getMyGarden(long userid);
}
