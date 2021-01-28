package com.creational_design_patterns.Factories;

import com.creational_design_patterns.Desserts.TropicMango;
import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Drinks.Cola;
import com.creational_design_patterns.Salads.Pekin;
import com.creational_design_patterns.Salads.Salad;

public class SpecialMealFactory implements MealFactory {
    @Override
    public Desserts addDessert() {return new TropicMango();}
    @Override
    public Drinks addDrink() {return new Cola();}
    @Override
    public Salad addSalad() {return new Pekin();}

}


