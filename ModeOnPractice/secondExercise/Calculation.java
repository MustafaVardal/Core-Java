package com.secondExercise;

public class Calculation implements ICalculation{
    private Numbers numbers;

    public Calculation(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public double sum() {

        return numbers.getFirstNumber() + numbers.getSecondNumber();
    }

    @Override
    public double sub() {

        return numbers.getFirstNumber() - numbers.getSecondNumber();
    }

    @Override
    public double avg() {
        return (numbers.getFirstNumber() + numbers.getSecondNumber()) / 2;
    }
}
