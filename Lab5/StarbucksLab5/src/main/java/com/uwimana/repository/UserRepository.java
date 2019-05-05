package com.uwimana.repository;

import com.uwimana.domain.User;

import java.util.List;

public interface UserRepository {
    public List<User> getAll();
    public User findByName(String name);
}
