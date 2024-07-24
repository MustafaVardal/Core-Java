package com.project7;

import java.util.Scanner;

public abstract class  UserLogin {
    private String username;
    private String password;
    protected Scanner scanner;

    public UserLogin(){
        scanner = new Scanner(System.in);
    }

    public void accept(){
        System.out.println("Enter the username : ");
        username = scanner.next();
        System.out.println("Enter the password : ");
        password = scanner.next();
    }

    public void display(){
        System.out.println("Your username is: " + username);
    }

    public abstract void loginCount();

}
