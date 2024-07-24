package com.project7;


public class Product {

    private int id;
    private String category;
    private int categoryNumber;

    public Product() {
    }

    public Product(int id, String category, int categoryNumber) {
        this.id = id;
        this.category = category;
        this.categoryNumber = categoryNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public static User createNewProduct(){
        String name = User.getName();
        return new User(name);
    }
}
