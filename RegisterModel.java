/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetbites.model;

/**
 *
 * @author Rahul
 */
public class RegisterModel {
    private String email;
    private String password;
    private String username;
    
    public RegisterModel(String email, String password, String username){
        this.email = email;
        this.password = password;
        this.username = username;
    }
    
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public String getUsername(){return username;}

}
