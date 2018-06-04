package com.openxcell.jetkinstest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testConnection {
    public static void main(String[] args){
        checkConnection();
    }

    public static void checkConnection(){
        String url = "jdbc:mysql://52.66.59.200:3306/testdatabase";
        String username = "root";
        String password = "root";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
