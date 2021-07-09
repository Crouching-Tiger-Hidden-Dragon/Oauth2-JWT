package com.Rest.repository;

import com.Rest.model.MyGarden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyGardenRepository extends JpaRepository<MyGarden, Long> {

    @Modifying
    @Query("delete from MyGarden g where g.userId= ?1 and g.plantId=?2")
    void deletePlant(long userId, long plantId);

    @Modifying
    @Query(value = "insert into mygarden (userid, plantid) VALUES (?1, ?2)", nativeQuery = true)
    void addPant(long userId, long plantId);

    @Modifying
    @Query("select g from MyGarden g where g.plantId = ?1")
    MyGarden findByPlantId(long plantId);

    @Modifying
    @Query(value = "SELECT g.userid, p.id, p.name, p.description, p.image,h.watering_date\n" +
            "from mygarden g \n" +
            "inner join plant p on g.plantid = p.id\n" +
            "left join (select garden_id, max(watering_date) watering_date from watering_history group by garden_id) h on h.garden_id=g.id\n" +
            "where g.userid = ?1", nativeQuery = true)
    List<MyGarden> getMyGarden(long userName);
}