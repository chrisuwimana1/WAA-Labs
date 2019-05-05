package com.uwimana.service.impl;

import com.uwimana.domain.User;
import com.uwimana.repository.UserRepository;
import com.uwimana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
