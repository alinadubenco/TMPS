package com.creational_design_patterns.Salads;

public class Pekin  implements Salad {
    @Override
    public void addSalad() {
        System.out.println("Pekin salad added to the meal");
    }
    @Override
    public void extra() {
        System.out.println("Extra meat");
    }
}
