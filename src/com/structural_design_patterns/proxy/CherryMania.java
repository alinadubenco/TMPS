package com.structural_design_patterns.proxy;
import com.creational_design_patterns.Desserts.Desserts;

public class CherryMania implements Desserts{
    private BabyDessert babyDessert;
    private final String component;

    public CherryMania(String component) {
        this.component= component;
    }

    @Override
    public void addDessert() {
        if(babyDessert == null){
            babyDessert = new BabyDessert(component);
        }
        babyDessert.addDessert();
    }
}
