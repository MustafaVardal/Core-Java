package com.project7;



public class TechnologyProduct extends  Product{
    private String name;
    private double price;
    private double cost;


    public TechnologyProduct(){

    }

    public TechnologyProduct(String name , double price, double cost) {
        this.name =name;
        this.price = price;
        this.cost = cost;

    }

    public TechnologyProduct(int id, String category, int categoryNumber,String name, double price, double cost) {
        super(id, category,categoryNumber);
        this.name = name;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
