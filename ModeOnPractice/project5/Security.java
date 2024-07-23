package com.project5;

import java.util.ArrayList;
import java.util.List;

public class Security extends Employee {
    private final static List<String> securityTypes = new ArrayList<>();

    public Security() {
        System.out.println("-----Security Departmant-----");
    }

    public void accept() {
        super.accept();
        System.out.println("How many department name you want to write? ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " . type : ");


            String type = sc.next();

            if (type.isBlank()) {
                type = sc.next();

            } else {
                type = type + " " + sc.next();

            }

            securityTypes.add(type);

        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\nSecurity Department names: ");

        for (String type : securityTypes) {
            System.out.println(type);
        }
    }
}
