package com.mycompany.budgetbites;

import com.mycompany.budgetbites.dao.AuthDAO;
import com.mycompany.budgetbites.model.RegisterModel;
import com.mycompany.budgetbites.view.RegisterFrame;

public class BudgetBites {

    public static void main(String[] args) {
//        System.out.println("This is Budget-Bites main file.");
//        // testing for DAO functionality
//        AuthDAO daoAuth = new AuthDAO();
//        String username = "testusername";
//        String email = "testemailjava@gmail.com";
//        String password = "jav123";
//        RegisterModel regmo = new RegisterModel(email, username, password);
//        
//        boolean check = daoAuth.register(regmo);
//        if (check == true){
//            System.out.println("Insert Success");
//        }else {
//            System.out.println("Insert Failure");
//        }

        RegisterFrame regFram = new RegisterFrame();
        regFram.setVisible(true);
        
    }
}
