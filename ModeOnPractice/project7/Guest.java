package com.project7;

public class Guest extends UserLogin{
    private int loginCount;
    @Override
    public void accept() {
        super.accept();

    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void loginCount() {
        loginCount++;
        System.out.println("Today visiting your profile: " + loginCount);

    }
}
