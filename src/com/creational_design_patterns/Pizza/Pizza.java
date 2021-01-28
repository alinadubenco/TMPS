package com.creational_design_patterns.Pizza;

public abstract class Pizza {
    public String dimensions;
    public String crustType;
    public String bun;
    public int crust;

    public Pizza() { }

    public Pizza(Pizza component) {
        if (component != null) {
            this.dimensions = component.dimensions;
            this.crustType = component.crustType;
            this.bun = component.bun;
            this.crust = component.crust;
        }
    }

    public abstract Pizza clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza that = (Pizza) o;
        return dimensions == that.dimensions &&
                crustType == that.crustType &&
                bun == that.bun && crust ==that.crust;
    }
}
