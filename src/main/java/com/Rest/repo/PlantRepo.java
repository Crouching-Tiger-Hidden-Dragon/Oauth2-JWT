package com.Rest.repo;

import com.Rest.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepo extends JpaRepository<Plant,Integer> {

}
