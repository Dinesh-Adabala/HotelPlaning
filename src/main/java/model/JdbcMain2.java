package model;


import java.sql.*;
import java.util.*;


class JdbcMain2 {

    public static void main(String a[]) {


        String url = "jdbc:postgresql://localhost:5432/nss";

        String user = "postgres";
        String pass = "554563@adS";

        Scanner k = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = k.next();

        System.out.println("Enter roll no:");
        int roll = k.nextInt();

        System.out.println("Enter class:");
        String cls = k.next();


        String sql = "INSERT INTO students (name, roll_no, class) VALUES ('" + name + "', " + roll + ", '" + cls + "')";


        Connection con = null;


        try {

            Class.forName("org.postgresql.Driver"); // This line is optional for JDBC 4.0+


            con = DriverManager.getConnection(url, user, pass);


            Statement st = con.createStatement();


            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("Inserted successfully: " + sql);
            } else {
                System.out.println("Insertion failed");
            }


            st.close();
            con.close();
        }

        catch (Exception ex) {

            System.err.println(ex);
        }
    }
}

