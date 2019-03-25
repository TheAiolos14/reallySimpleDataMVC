package com.miniMadrid.demo.miniMadrid.service;

import com.miniMadrid.demo.miniMadrid.entity.Data;
import com.miniMadrid.demo.miniMadrid.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DataServiceImpl implements DataService {

    @Autowired
    private DataRepository dataRepository;

    @Override
    public List<Data> findById(String id) {
        dataRepository.findById(id);
        return null;
    }

}
