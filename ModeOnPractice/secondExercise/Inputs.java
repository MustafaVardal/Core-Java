package com.secondExercise;

import java.util.Scanner;

public class Inputs {
    public static Numbers getNumberInputs(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        return new Numbers(firstNumber,secondNumber);
    }
}
