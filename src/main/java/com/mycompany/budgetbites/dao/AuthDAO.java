package com.mycompany.budgetbites.dao;
import com.mycompany.budgetbites.database.MySqlConnection;
import com.mycompany.budgetbites.model.LoginModel;
import com.mycompany.budgetbites.model.SignUpModel;
import com.mycompany.budgetbites.model.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthDAO extends MySqlConnection {
    public boolean signUp(SignUpModel user) {
        try {
            PreparedStatement sp = null;
            Connection con = openConnection();
            
            String sql = "INSERT INTO users(firstname, lastname, email, password) VALUES(?,?,?,?)";
            // ? represent placeholder, wildcard, In-case String can be plused so String may bigrina. so we fill up 
            // question mark later on.
            sp = con.prepareStatement(sql);
            sp.setString(1, user.getFirstName());
            sp.setString(2, user.getLastName());
            sp.setString(3, user.getEmail());
            sp.setString(4, user.getPassword());
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
    public UserData login(LoginModel login){
        try{
            PreparedStatement ps = null;
            Connection conn = openConnection();
            String sql = "SELECT * FROM users WHERE email = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,login.getEmail());
            ps.setString(2, login.getPassword());
            
            ResultSet result = ps.executeQuery();
            if(result != null && result.next() != false){
                // get data here
                String email = result.getString("email");
                String password = result.getString("password");
                
                UserData user = new UserData(
                        email, password
                );
                return user;
            }else{
                return null;
            }
        }catch(Exception exception){
           return null;
        }
        
    }
}