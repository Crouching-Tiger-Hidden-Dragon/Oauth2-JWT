package com.Rest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Watering_history {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int garden_id;
    private Date watering_date;
}
