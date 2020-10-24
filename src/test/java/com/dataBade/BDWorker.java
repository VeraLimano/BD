package com.dataBade;

import java.sql.*;

public class BDWorker {

    private static final String URL = "jdbc:mysql://localhost:3306/mybdtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    Connection connection;


    public BDWorker() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException throwables) {
            System.out.printf("no conect");
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            Statement statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

//        public Connection getConnection() {
//            return connection;
//        }
}
