/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetbites.dao;
import com.mycompany.budgetbites.database.MySqlConnection;
import com.mycompany.budgetbites.model.RegisterModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Rahul
 */
public class AuthDAO extends MySqlConnection {
    public boolean register(RegisterModel user) {
        try {
            PreparedStatement sp = null;
            Connection con = openConnection();
            
            String sql = "INSERT INTO users(username, email, password) VALUES(?,?,?)";
            // ? represent placeholder, wildcard, In-case String can be plused so String may bigrina. so we fill up 
            // question mark later on.
            sp = con.prepareStatement(sql);
            sp.setString(1, user.getUsername());
            sp.setString(2, user.getEmail());
            sp.setString(3, user.getPassword());
            // this is filling ? through PrepareStatement "setter statement. here i represents first Question Mark"
            
            int result = sp.executeUpdate(); // returns (1) if insert success else (-1)
            if(result == -1) {
                return false;
            } else {
            return true;}
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
