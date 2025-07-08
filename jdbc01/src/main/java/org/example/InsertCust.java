package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCust {
    public static void main(String[] args) {
        //1. MySQL Driver Loading ...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql JDBC Driver not found");
        }
        //2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String user = "smuser";
        String password = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Connection error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // 3. SQL
        String insertSql = "INSERT INTO cust VALUES(?,?,?,NOW(),NOW())";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(insertSql);
            ps.setString(1, "id04");
            ps.setString(2, "pwd04");
            ps.setString(3, "최말숙");
            int result = ps.executeUpdate();
            System.out.println(result);
            System.out.println("Inserted rows into database");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}