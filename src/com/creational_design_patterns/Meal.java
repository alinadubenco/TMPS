package com.creational_design_patterns;


import java.util.Scanner;
import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Pizza.Pizza;
import com.creational_design_patterns.Salads.Salad;
import com.creational_design_patterns.Pizza.PizzaClassic;
import com.creational_design_patterns.Pizza.Special;
import com.creational_design_patterns.Factories.MealFactory;
import com.creational_design_patterns.Factories.SpecialMealFactory;
import com.creational_design_patterns.Factories.ClassicMealFactory;
import com.behavioral_design_patterns.mediator.Mediator.MealStatus;
import com.behavioral_design_patterns.mediator.Mediator;

public class Meal {
    private static Desserts dessert;
    private static Drinks drink;
    private static Salad salad;

    public MealStatus status;
    Mediator mediator = null;
    public String name;


    public Meal(MealFactory mealFactory) {
        dessert = mealFactory.addDessert();
        drink = mealFactory.addDrink();
        salad = mealFactory.addSalad();
    }

    public Meal(Mediator mediator, String orderName) {
        status = MealStatus.NOT_CHECKED;
        name = orderName;
        this.mediator = mediator;
    }

    public Meal (MealStatus status, Mediator mediator, String orderName) {
        this.status = status;
        name = orderName;
        this.mediator = mediator;
    }

    public static void buildMeal(){
        salad.addSalad();
        salad.extra();
        drink.addDrink();
        dessert.addDessert();
    }

    public static Meal getMeal(){
        Meal meal = null;
        MealFactory mealFactory;

        Scanner response = new Scanner(System.in);
        System.out.println("Enter Meal type:");
        String pcType = response.nextLine();

        if(pcType.equalsIgnoreCase("Special")){
            mealFactory = new SpecialMealFactory();
            meal = new Meal(mealFactory);

            Special special = new Special();
            special.dimensions= "L";
            special.crust= 2;
            special.crustType = "thin";
            special.bun = "integral";
            special.pizzaType= "special";

            Scanner specialResponse = new Scanner(System.in);
            System.out.println("Do you want another pizza? yes/no");
            String extraPizza = specialResponse.nextLine();

            if(extraPizza.equals("yes")){
                Pizza secondSpecial = (Special) special.clone();
                System.out.println("Added second identical special pizza \n" +
                        "Pizza1 - " + special.toString() + "\nPizza2 - " + secondSpecial.toString());
            } else {
                System.out.println("Your special meal is ready.");
            }

        } else if (pcType.equalsIgnoreCase("Classic")){
            mealFactory = new ClassicMealFactory();
            meal = new Meal(mealFactory);

            PizzaClassic classic = new PizzaClassic();
            classic.dimensions = "S";
            classic.crust = 1;
            classic.crustType = "Classic";
            classic.pizzaType= "classic";

            Scanner classicResponse = new Scanner(System.in);
            System.out.println("Do you want another pizza? yes/no");
            String extraPizza = classicResponse.nextLine();

            if(extraPizza.equals("yes")){
                PizzaClassic secondPizza = (PizzaClassic) classic.clone();
                System.out.println("Added second identical classic pizza\n" +
                        "Pizza1 - " + classic.toString() + "\nPizza2 - " + secondPizza.toString());
            } else {
                System.out.println("Your classic meal is ready.");
            }

        } else {
            System.out.println("Can't build such a meal.");
        }
        return meal;
    }

    public void checkMeal () {
        mediator.checkMeal(this);
        System.out.println("Meal ingredients are checked and added the necessary one");
    }

    public void add(){
        mediator.add(this);
    }
}
