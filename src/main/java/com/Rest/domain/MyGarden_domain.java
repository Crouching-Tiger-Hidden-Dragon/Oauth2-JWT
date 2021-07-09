package com.Rest.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// getMyGarden
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyGarden_domain {
    private String name;
    private String description;
    private String image;
    private Date last_watering;
}
