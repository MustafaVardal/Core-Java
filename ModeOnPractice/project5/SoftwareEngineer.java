package com.project5;

public class SoftwareEngineer extends Employee {

    private String skill;

    public SoftwareEngineer(){
        System.out.println("------Software Engineer Employee Platform------");
    }

    @Override
    public void accept() {
        super.accept();
        System.out.println("Skills: ");
        skill = sc.next();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Skill: " + skill);
    }
}
