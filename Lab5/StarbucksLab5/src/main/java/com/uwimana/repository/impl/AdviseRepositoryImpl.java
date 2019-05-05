package com.uwimana.repository.impl;

import com.uwimana.data.Database;
import com.uwimana.repository.AdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AdviseRepositoryImpl implements AdviceRepository {

    @Autowired
    Database data;

    public List<String> getListByType(String type) {
        return data.advice.get(type);
    }

    public Map<Integer, String> getAllRoasts() {
        return data.roasts;
    }

    public String getRoast(Integer key) {
        return data.roasts.get(key);
    }




}
