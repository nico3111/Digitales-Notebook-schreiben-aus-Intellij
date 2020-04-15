package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/notebook?user=root";
            conn = DriverManager.getConnection(url);
            System.out.println("Connenction access");

            Statement stmt = null;
            String sql = "INSERT INTO textentry(comment, date, note)" +
                    "VALUES ('eintrag aus Intellj', " +
                    "'2020-04-15', " +
                    "'dies ist mein zweiter eintrag in das Digitale Notizbuch')";

            stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
