package com.Rest.repository;

import com.Rest.model.MyGarden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MyGardenRepository extends JpaRepository<MyGarden, Long> {

    @Modifying
    @Query("delete from MyGarden g where g.userId= ?1 and g.plantId=?2")
    void deletePlant(long userId, long plantId);

    @Modifying
    @Query(value = "insert into mygarden (userid, plantid) VALUES (?1, ?2)", nativeQuery = true)
    void addPant(long userId, long plantId);

    @Query("select g from MyGarden g where g.userId = ?1 and g.plantId = ?2")
    MyGarden findByPlantId(long userId, long plantId);

    @Query(value = "SELECT * FROM plantcare.view_mygarden where userid = ?1 ", nativeQuery = true)
    List<MyGardenDetail> getMyGarden(long userId);

    public interface MyGardenDetail{
        long getUserId();
        long getPlantId();
        String getName();
        String getDescription();
        String getImage();
        int getWaterDays();
        Date getLastWaterDate();
    }
}