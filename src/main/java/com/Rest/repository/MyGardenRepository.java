package com.Rest.repository;

import com.Rest.model.MyGarden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MyGardenRepository extends JpaRepository<MyGarden, Long> {

    @Modifying
    @Query("delete from MyGarden g where g.userId= ?1 and g.plantId=?2")
    void deletePlant(long userId, long plantId);
    @Query("select g from MyGarden g where g.plantId = ?1")
    MyGarden findByPlantId(long plantId);
}