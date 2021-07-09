package com.Rest.service;

import com.Rest.model.MyGarden;
import com.Rest.repository.MyGardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MyGardenService implements IMyGardenService {

    @Autowired
    private MyGardenRepository myGardenRepository;

    @Override
    public void deletePlant(long userId, long plantId) {
        myGardenRepository.deletePlant(userId, plantId);
    }

    @Override
    public void add(long userId, long plantId){
        myGardenRepository.addPant(userId, plantId);
    }

    @Override
    public MyGarden findByPlantId(long plantId) {
        return myGardenRepository.findByPlantId(plantId);
    }
}
