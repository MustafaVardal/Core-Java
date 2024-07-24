package com.project6;

import java.util.Scanner;

public class BankAccount {

    private int accountNumber;
    private String customerName;
    protected Scanner sc;

    public BankAccount(){
        sc = new Scanner(System.in);
    }

    public void accept(){
        System.out.println("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter Customer Name: ");
        customerName = sc.next();
    }
    public void display(){
        System.out.println("Account number is : " + accountNumber);
        System.out.println("Customer name is : " + customerName);
    }
}
