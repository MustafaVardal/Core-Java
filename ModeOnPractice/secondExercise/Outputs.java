package com.secondExercise;

public class Outputs {
    private Numbers numbers;
    private ICalculation calculation;

    public Outputs(Numbers numbers, ICalculation calculation) {
        this.numbers = numbers;
        this.calculation = calculation;
    }

    public void print(){
        if (numbers !=null) {
            System.out.println(numbers.getFirstNumber() + "+" + numbers.getSecondNumber() + " = " + calculation.sum());
            System.out.println(numbers.getFirstNumber() + "-" + numbers.getSecondNumber() + " = " + calculation.sub());
            System.out.println(numbers.getFirstNumber() + " and " + numbers.getSecondNumber() + " of averages " + calculation.avg());
        } else{
            System.out.println("Error: Numbers object are not initialized.");
        }
    }

}
