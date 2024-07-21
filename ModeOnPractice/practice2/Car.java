package com.practice2;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Car Brand: "+this.brand + "\nCar model: " + this.model + "\nCar year: " + this.year +"\nPrice: " + this.price);
    }
}
