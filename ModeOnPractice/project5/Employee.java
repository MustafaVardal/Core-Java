package com.project5;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    protected Scanner sc;

    public Employee() {
        //System.out.println("Employee class is base now.");
        sc = new Scanner(System.in);
    }


    public void accept() {
        System.out.println("Enter empId: ");
        empId = sc.nextInt();
        ;
        System.out.println("Enter empName: ");
        empName = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextDouble();
    }


    public void display() {
        System.out.println("Employee ID: " + +empId + "\nEmployee Name: " + empName + "\nEmployee Salary: " + salary);

    }
}
