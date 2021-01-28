package com.creational_design_patterns.Pizza;

public class PizzaClassic extends Pizza {
    public String pizzaType;

    public PizzaClassic() {
    }

    public PizzaClassic(PizzaClassic target) {
        super(target);
        if (target != null) {
            this.pizzaType = target.pizzaType;
        }
    }

    @Override
    public Pizza clone() {
        return new PizzaClassic(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PizzaClassic classic = (PizzaClassic) o;
        return pizzaType.equals(classic.pizzaType);
    }

    @Override
    public String toString() {
        return "PizzaClassic " +
                ", pizzaType='" + pizzaType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", crust='" + crust + '\'' +
                ", crustType='" + crustType + '\'' ;
    }
}
