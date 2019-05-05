package com.uwimana.service.impl;

import com.uwimana.repository.AdviceRepository;
import com.uwimana.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    AdviceRepository adviceRepository;

    @Override
    public List<String> getListByType(String type) {
        return adviceRepository.getListByType(type);
    }

    @Override
    public Map<Integer, String> getAllRoasts() {
        return adviceRepository.getAllRoasts();
    }

    @Override
    public String getRoast(Integer key) {
        return adviceRepository.getRoast(key);
    }
}
