package com.chadcover.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimeZone=UTC-4";
        String user = "springstudent";
        String password = "springstudent";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection successful!");
        } catch (Exception e ){
            e.printStackTrace();
        }
    }

}
