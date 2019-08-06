package factory.products.nystyle;

import factory.products.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Stlye Clam Pizza";
        dough = "Thin Dough";
        sauce = "Tomato Sauce";

        toppings.add("Mozarella Cheese");
    }
}
