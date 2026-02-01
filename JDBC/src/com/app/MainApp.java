package com.app;

import com.app.dao.UserDAO;
import com.app.dao.implementation.UserDaoImpl;

public class MainApp {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDaoImpl();

        userDAO.findAll().forEach(user -> System.out.println(user.getName()));
    }
}
