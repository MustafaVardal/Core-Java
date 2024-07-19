package com.simplexercise;

import java.util.Scanner;

public class Calculation implements Addible, Subtractable, Averageable {
    private int firstValue;
    private int secondValue;
    private String choose;
    private Scanner scanner;

    public void config(){
        scanner = new Scanner(System.in);
        System.out.println("Please choose one of those:\n1)Add\n2)Sub\n3)Avg  ");
        choose = scanner.next();
        System.out.println("Enter the first number: ");
        firstValue = scanner.nextInt();
        System.out.println("Enter the second number: ");
        secondValue = scanner.nextInt();
    }


    @Override
    public int add() {
        return firstValue + secondValue;
    }

    @Override
    public int sub() {
        return firstValue - secondValue;
    }

    @Override
    public int avg() {
        return (firstValue + secondValue)/2;
    }

    public void display() {
        if (choose.substring(0, 3).equals("Add")){
            System.out.println("Your result :\t " + add());
        } if (choose.substring(0, 3).equals("Sub")){
            System.out.println("Your result :\t " + sub());
        } if (choose.substring(0, 3).equals("Avg")){
            System.out.println("Your result :\t " + avg());
        }

    }
}
