package com.app;

import com.app.dao.EmployeeDAO;
import com.app.dao.implementation.EmployeeDaoImpl;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDaoImpl();

        employeeDAO.findAll().forEach(emp -> System.out.println(emp.getName().toUpperCase() + " earns ₹" + emp.getSalary() + " per month!"));
    }
}
