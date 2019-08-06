package factory.products.nystyle;

import factory.products.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Stlye Veggie Pizza";
        dough = "Thin Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Cheese");
        toppings.add("Vegetables");
    }
}
