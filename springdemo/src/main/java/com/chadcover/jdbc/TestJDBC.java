package com.chadcover.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_person_tracker?useSSL=false&serverTimeZone=UTC-4";
        String user = "hbperson";
        String password = "Yadda@2022";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!");
        } catch (Exception e ){
            e.printStackTrace();
        }
    }

}
