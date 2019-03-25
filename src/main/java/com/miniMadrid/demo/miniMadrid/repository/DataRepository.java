package com.miniMadrid.demo.miniMadrid.repository;

import com.miniMadrid.demo.miniMadrid.entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DataRepository extends MongoRepository<Data, String> {

    Optional<Data> findById(Data data);

}
