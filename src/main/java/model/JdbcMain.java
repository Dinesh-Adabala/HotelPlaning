package model;

import java.io.*;
import java.sql.*;

class JdbcMain {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/nss";
        String username = "postgres";
        String password = "554563@adS";
        String query = "SELECT * FROM students";


        Class.forName("org.postgresql.Driver");


        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);


        if (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }


        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}


