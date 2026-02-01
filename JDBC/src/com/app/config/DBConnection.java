package com.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:postgresql://localhost:5432/comapany_db";
    private static final String user = "postgres";
    private static final String password = "arsalanrather";

    public static Connection connect() throws SQLException {
            return DriverManager.getConnection(url, user, password);
    }
}
