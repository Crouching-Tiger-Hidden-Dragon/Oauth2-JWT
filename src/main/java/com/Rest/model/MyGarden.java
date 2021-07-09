package com.Rest.model;


import javax.persistence.*;

@Entity
@Table(name = "mygarden")
public class MyGarden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name="userid")
    private long userId;

    @Column(name="plantid")
    private long plantId;

    public MyGarden(){}

    public MyGarden (long userId, long plantId){
        this.userId = userId;
        this.plantId = plantId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPlantId() {
        return plantId;
    }

    public void setPlantId(long plantId) {
        this.plantId = plantId;
    }
}
