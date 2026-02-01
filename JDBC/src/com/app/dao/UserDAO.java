package com.app.dao;

import com.app.model.User;

import java.util.List;

public interface UserDAO {
    int create(User user);
    User findById(int id);
    List<User> findAll();
    int deleteById(int id);
}
