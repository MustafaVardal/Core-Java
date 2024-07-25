package com.project8;

import java.util.Scanner;

public class Triangle extends Geometry implements Shape, Print {
    private double a;
    private double b;
    private double c;
    private double base;
    private double height;
    private double result;
    private final int selection;
    protected Scanner sc;


    public Triangle() {
        sc = new Scanner(System.in);
        System.out.println("== | Triangle Calculation | ==");
        System.out.println("Please select the calculation type:\nFor Area, press -1- \nFor Perimeter, press -2- ");
        selection = sc.nextInt();
    }

    @Override
    public void accept() {
        switch (selection) {
            case 1:
                System.out.println("Enter the first side of triangle :");
                a = sc.nextDouble();
                System.out.println("Enter the second side of triangle :");
                b = sc.nextDouble();
                System.out.println("Enter the third side of triangle :");
                c = sc.nextDouble();
                break;
            case 2:
                System.out.println("Enter the base number of value: ");
                base = sc.nextDouble();
                System.out.println("Enter the height number of value: ");
                height = sc.nextDouble();
                break;
            default:
                System.out.println("Please enter the proper number.");
        }
    }

    @Override
    public double area() {
        result = a + b + c;

        return result;
    }

    @Override
    public double perimeter() {
        result = (base * height) / 2;
        return result;
    }

    @Override
    public void display() {
        switch (selection) {
            case 1:
                System.out.println("Result of Triangle Area: " + area());
                break;
            case 2:
                System.out.println("Result of Triangle Perimeter: " + perimeter());
                break;
        }


    }
}
