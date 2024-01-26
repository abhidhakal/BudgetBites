package com.mycompany.budgetbites.database;
import java.sql.*;

public class MySqlConnection implements DbConnection{

    @Override
    public Connection openConnection() {
        try {
            String username = "root";
            String password = "password";
            String database = "budgetbites";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password
            );
            if (connection == null) {
                System.out.println("Database Connection Fail");
            } else {
                System.out.println("Database Connection Pass");
            }
            return connection; // Don't forget to return the connection if successful
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    @Override
    public void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
    }

    @Override
    public ResultSet runQuery(Connection con, String query) {
        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;
        }catch(Exception e){
        System.out.println(e);
        return null;
        }
    }

    @Override
    public int executeUpdate(Connection con, String query) {
        try{
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(query);
            return result;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }
    
}
