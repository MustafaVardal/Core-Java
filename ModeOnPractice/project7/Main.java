package com.project7;

public class Main {
    public static void main(String[] args) {
        UserLogin userLogin;
        userLogin = new Guest();
        userLogin.accept();
        userLogin.display();
        userLogin.loginCount();

        System.out.println("===============General Products===============");
        Product product = new Product();
        product.setId(1);
        product.setCategory("Technology");
        product.setCategoryNumber(1);
        System.out.println(product.getId());
        System.out.println(product.getCategory());
        System.out.println(product.getCategoryNumber());

        System.out.println("");

        System.out.println("===============Technology Products===============");
        TechnologyProduct technologyProduct = new TechnologyProduct();
        technologyProduct.setName("Asus Laptop");
        technologyProduct.setPrice(1230);
        technologyProduct.setCost(150);
        System.out.println(product.getId());
        System.out.println(product.getCategory());
        System.out.println(product.getCategoryNumber());
        System.out.println(technologyProduct.getName() + " Subset of " + product.getCategory()) ;
        System.out.println(technologyProduct.getPrice());
        System.out.println(technologyProduct.getCost());



    }

}
