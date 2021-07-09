package com.Rest.service;

import com.Rest.model.MyGarden;
import com.Rest.repository.MyGardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MyGardenService implements IMyGardenService {

    @Autowired
    private MyGardenRepository myGardenRepository;

    @Override
    public void deletePlant(long gardenId) {
        myGardenRepository.deletePlant(gardenId);
    }

    @Override
    public void add(long userId, long plantId){
        myGardenRepository.addPant(userId, plantId);
    }

    @Override
    public MyGarden findByPlantId(long userId, long plantId) {
        return myGardenRepository.findByPlantId(userId, plantId);
    }

    @Override
    public List<MyGardenRepository.MyGardenDetail> getMyGarden(long userId) {
        return myGardenRepository.getMyGarden(userId);
    }
}
