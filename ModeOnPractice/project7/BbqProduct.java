package com.project7;

public class BbqProduct extends Product{

    private String name;

    private String image;

    public BbqProduct() {
    }

    public BbqProduct(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public BbqProduct(int id, String category, int categoryNumber, String name, String image) {
        super(id, category, categoryNumber);
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
