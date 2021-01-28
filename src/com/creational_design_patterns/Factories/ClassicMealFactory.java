package com.creational_design_patterns.Factories;

import com.creational_design_patterns.Salads.Greek;
import com.creational_design_patterns.Salads.Salad;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Drinks.Dorna;
import com.creational_design_patterns.Desserts.Desserts;
import  com.creational_design_patterns.Desserts.FruitSalad;

public class ClassicMealFactory implements MealFactory {
    @Override
    public Desserts addDessert() {return new FruitSalad();}
    @Override
    public Drinks addDrink() {return new Dorna();}
    @Override
    public Salad addSalad() {return new Greek();}

}
