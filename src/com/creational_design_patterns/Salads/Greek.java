package com.creational_design_patterns.Salads;

public class Greek implements Salad {
    @Override
    public void addSalad() {
        System.out.println("Greek salad added to the meal");
    }
    @Override
    public void extra() {
        System.out.println("Extra parmesane added");
    }
}
