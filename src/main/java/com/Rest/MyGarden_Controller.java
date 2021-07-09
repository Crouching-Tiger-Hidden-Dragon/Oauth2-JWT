package com.Rest;

import com.Rest.domain.MyGarden_domain;
import com.Rest.model.MyGarden;
import com.Rest.model.Plant;
import com.Rest.model.Watering_history;
import com.Rest.repo.PlantRepo;
import com.Rest.repo.Watering_historyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MyGarden_Controller {

    @Autowired
    PlantRepo plantRepo;
    @Autowired
    Watering_historyRepo watering_historyRepo;



//    @GetMapping("/getMyGarden")
//    public ResponseEntity<List<MyGarden_domain>> getMyGarden(){
//        List<MyGarden_domain> getMyGarden=new ArrayList<>();
//        List<Plant> getAllPlant=plantRepo.findAll();
//        List<Watering_history> getAllWatering_history=watering_historyRepo.findAll();
//        getAllPlant.stream().forEach(i->{
//            MyGarden_domain myGarden_domain=new MyGarden_domain();
//            myGarden_domain.setDescription(i.getDescription());
//            myGarden_domain.setImage(i.getImage());
//            myGarden_domain.setName(i.getName());
//            myGarden_domain.setLast_watering(watering_historyRepo.find);
//
//        });
//
//
//        return
//    }
}
