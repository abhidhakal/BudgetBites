/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetbites.model;

/**
 *
 * @author Rahul
 */
public class SignUpModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    
    public SignUpModel(String email, String password, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}


}
