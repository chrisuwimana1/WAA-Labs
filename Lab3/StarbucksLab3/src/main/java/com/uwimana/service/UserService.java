package com.uwimana.service;

import com.uwimana.domain.User;

import java.util.List;

public interface UserService {


    public List<User> getAll();

    public User findByName(String name);

}
