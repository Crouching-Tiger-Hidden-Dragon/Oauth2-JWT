package com.Rest.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "watering_history")
public class Water {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name="garden_id")
    private long gardenId;

    @Column(name="watering_date")
    private Date waterDate;

    public Water(){}

    public Water(long gardenId, Date waterDate){
        this.gardenId = gardenId;
        this.waterDate = waterDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGardenId() {
        return gardenId;
    }

    public void setGardenId(long gardenId) {
        this.gardenId = gardenId;
    }

    public Date getWaterDate() {
        return waterDate;
    }

    public void setWaterDate(Date waterDate) {
        this.waterDate = waterDate;
    }
}

