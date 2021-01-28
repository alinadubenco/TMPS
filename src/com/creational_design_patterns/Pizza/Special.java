package com.creational_design_patterns.Pizza;

public class Special  extends Pizza {
    public String pizzaType;

    public Special() {
    }

    public Special(Special target) {
        super(target);
        if (target != null) {
            this.pizzaType = target.pizzaType;
        }
    }

    @Override
    public Pizza clone() {
        return new Special(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Special special = (Special) o;
        return pizzaType.equals(special.pizzaType);
    }

    @Override
    public String toString() {
        return "Special " +
                ", pizzaType='" + pizzaType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", crust='" + crust + '\'' +
                ", crustType='" + crustType + '\'' ;

    }
}