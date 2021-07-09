package com.Rest.service;

import com.Rest.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WaterService implements IWaterService {

    @Autowired
    private WaterRepository waterRepository;

    @Override
    public void addWater(long gardenId) {
        waterRepository.addWater(gardenId);
    }
}
