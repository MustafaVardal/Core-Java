package com.project6;

public class SavingAccount extends BankAccount{
    private int interestRate;

    @Override
    public void accept() {
        super.accept();
        System.out.println("Enter Interest Rate: ");
        interestRate = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Interest rate is : " + interestRate);
    }
}
