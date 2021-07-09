package com.Rest.repo;

import com.Rest.model.MyGarden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyGardenRepo extends JpaRepository<MyGarden, Integer> {

}
