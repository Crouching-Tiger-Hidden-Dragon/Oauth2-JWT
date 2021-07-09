package com.Rest.service;


import java.util.List;
import com.Rest.model.MyGarden;
import java.util.List;
import java.util.Optional;

public interface IMyGardenService {
    void deletePlant(long userId, long plantId);
    MyGarden add(MyGarden myGarden);
    MyGarden findByPlantId(long plantId);
}
