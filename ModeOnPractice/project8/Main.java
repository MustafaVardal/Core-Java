package com.project8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice ;

        do {
            System.out.println("\nChoose a shape:");
            System.out.println("1. Triangle");
            System.out.println("2. Circle");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Geometry geometry;
            switch (choice) {
                case 1:
                    geometry = new Triangle();
                    ((Triangle) geometry).accept();
                    ((Triangle) geometry).display();
                    break;
                case 2:
                    geometry = new Circle();
                    ((Circle) geometry).accept();
                    ((Circle) geometry).display();
                    break;
                case 3:
                    geometry = new Rectangle();
                    ((Rectangle) geometry).accept();
                    ((Rectangle) geometry).display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

    }
}
