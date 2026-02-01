package com.app.dao.implementation;

import com.app.config.DBConnection;
import com.app.dao.UserDAO;
import com.app.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDAO {
    @Override
    public int create(User user) {
        String sql = "INSERT INTO users(name,age,salary) VALUES(?,?,?)";
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
    public User findById(int id) {
        String sql = "SELECT * FROM users WHERE ID = ?;";
        User user = null;

        try (Connection con = DBConnection.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
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
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users;";

        try (Connection con = DBConnection.connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {


            while (rs.next()) {
                User user = new User();
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
        String sql = "DELETE  FROM users WHERE ID=?";

        try (Connection con = DBConnection.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
