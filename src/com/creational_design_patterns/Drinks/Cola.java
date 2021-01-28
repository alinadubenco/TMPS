package com.creational_design_patterns.Drinks;

import com.creational_design_patterns.Drinks.Drinks;

public class Cola implements Drinks {

    @Override
    public void addDrink() {
        System.out.println("Cola added to the meal");
    }
}