package com.project8;

import java.util.Scanner;

public class Circle extends Geometry  implements Shape, Print {
    private final static double PI = 3.14;
    private double radius;
    private double result;
    protected Scanner scanner;
    private final int selection;

    public Circle() {
        scanner = new Scanner(System.in);
        System.out.println("== | Circle Calculation | ==");
        System.out.println("Please select the calculation type:\nFor Area, press -1- \nFor Perimeter, press -2- ");
        selection = scanner.nextInt();
    }

    @Override
    public void accept() {
        if (selection > 3 || selection < 0) {
            System.out.println("Please enter the proper number.");
        } else {
            System.out.println("Enter the radius value :");
            radius = scanner.nextDouble();
        }
    }

    @Override
    public double area() {
        result = PI * radius * radius;
        return result;
    }


    @Override
    public double perimeter() {
        result = 2 * PI * radius;
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
