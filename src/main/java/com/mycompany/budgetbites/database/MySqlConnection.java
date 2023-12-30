/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetbites.database;
import java.sql.*;
/**
 *
 * @author Rahul
 */
public class MySqlConnection implements DbConnection{

    @Override
    public Connection openConnection() {
        try {
            String username = "root";
            String password = "3249087RaC@74";
            String database = "BudgetBites";
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
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
