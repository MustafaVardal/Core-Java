package com.project6;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accept();
        bankAccount.display();

        System.out.println("====Details for Saving Account====");

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.accept();
        savingAccount.display();
    }
}
