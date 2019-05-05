package com.uwimana.repository.impl;

import com.uwimana.data.Database;
import com.uwimana.domain.User;
import com.uwimana.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl  implements UserRepository {

    @Autowired
    Database data;

    @Override
    public List<User> getAll(){
        return (List<User>) data.users.values();
    }

    @Override
    public User findByName(String name){
        User user = data.users.get(name);
        return user;
    }


}
