package com.project5;

public class Trainer extends Employee{
    private String studentName;

    public Trainer(){
        System.out.println("Trainer is launching now.");

    }

    public void accept(){
        super.accept();
        System.out.println("Enter the student name: ");
        studentName = sc.next();

    }

    public void display(){
        super.display();
        System.out.println("Student name: " + studentName);
    }

}
