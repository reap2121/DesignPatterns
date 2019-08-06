package factory.products.nystyle;

import factory.products.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Stlye Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
