package com.practice2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model 3",2024, 38300);
        car.displayDetails();
        System.out.println("\nAfter tax refund\n");
        car.setPrice(31000);
        car.displayDetails();
    }
}
