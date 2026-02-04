package com.app.dao.implementation;

import com.app.config.DBConnection;
import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDAO {
    @Override
    public int create(Employee user) {
        String sql = "INSERT INTO employees(name,age,salary) VALUES(?,?,?)";
        try (Connection con = DBConnection.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.setDouble(3, user.getSalary());

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee findById(int id) {
        String sql = "SELECT * FROM employees WHERE ID = ?;";
        Employee user = null;

        try (Connection con = DBConnection.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new Employee();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setSalary(rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> users = new ArrayList<>();
        String sql = "SELECT * FROM employees;";

        try (Connection con = DBConnection.connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {


            while (rs.next()) {
                Employee user = new Employee();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setSalary(rs.getDouble("salary"));

                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public int deleteById(int id) {
        String sql = "DELETE  FROM employees WHERE ID=?";

        try (Connection con = DBConnection.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
