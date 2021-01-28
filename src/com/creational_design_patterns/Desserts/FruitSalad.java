package com.creational_design_patterns.Desserts;
import com.structural_design_patterns.proxy.Components;
import java.util.HashMap;

public class FruitSalad implements Desserts {
    @Override
    public void addDessert() {
        System.out.println("Fruit Salad added to the meal's dessert ");
    }
}
