package com.dataBade;

import java.sql.*;

public class Solution {

        public static void main(String[] args) {
            BDWorker worker = new BDWorker();

            String query = "select * from users";

            try {
                Statement statement = worker.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));

                    System.out.println(user);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
