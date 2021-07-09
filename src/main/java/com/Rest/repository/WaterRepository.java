package com.Rest.repository;

import com.Rest.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Rest.model.Water;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WaterRepository extends JpaRepository<Water, Long> {
    @Modifying
    @Query(value = "insert into watering_history (garden_id, watering_date) VALUES (?1, Now())", nativeQuery = true)
    void addWater(long gardenId);
}