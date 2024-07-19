package com.secondExercise;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = Inputs.getNumberInputs();
        ICalculation calculation = new Calculation(numbers);
        Outputs outputs = new Outputs(numbers, calculation);
        outputs.print();


    }
}
