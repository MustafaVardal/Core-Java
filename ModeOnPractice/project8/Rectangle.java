package com.project8;

import java.util.Scanner;

public class Rectangle extends Geometry implements Shape, Print{

    private double length;
    private double width;
    protected Scanner scanner;
    private double result;
    private final int selection;

    public Rectangle() {
        scanner = new Scanner(System.in);
        System.out.println("== | Rectangle Calculation | ==");
        System.out.println("Please select the calculation type:\nFor Area, press -1- \nFor Perimeter, press -2- ");
        selection = scanner.nextInt();
    }


    @Override
    public void accept() {
        switch (selection) {
            case 1:
                System.out.println("Area");
                System.out.println("Enter the length :");
                length = scanner.nextDouble();
                System.out.println("Enter the width :");
                width = scanner.nextDouble();
                break;
            case 2:
                System.out.println("Perimeter");
                System.out.println("Enter the length :");
                length = scanner.nextDouble();
                System.out.println("Enter the width :");
                width = scanner.nextDouble();
                break;
            default:
                System.out.println("Please enter the proper number.");

        }
    }
    @Override
    public double area() {
        result = length * width;
        return result;
    }

    @Override
    public double perimeter() {
        result = 2*(length + width);
        return result;
    }

    @Override
    public void display() {
        switch (selection) {
            case 1:
                System.out.println("Result of Circle Area: " + area());
                break;
            case 2:
                System.out.println("Result of Circle Perimeter: " + perimeter());
                break;
        }
    }


}
