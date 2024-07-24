package com.project7;

import java.util.Scanner;

public class User {
    private String name;
    protected Scanner scanner;

    public User(String name) {
    }

    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Product name: ");
        return scanner.nextLine();
    }

}
