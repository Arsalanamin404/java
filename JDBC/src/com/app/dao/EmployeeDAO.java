package com.app.dao;

import com.app.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    int create(Employee user);

    Employee findById(int id);

    List<Employee> findAll();

    int deleteById(int id);
}