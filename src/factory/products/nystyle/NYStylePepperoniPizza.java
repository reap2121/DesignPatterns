package factory.products.nystyle;

import factory.products.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Stlye Sauce and Pepperoni Pizza";
        dough = "Thick Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Cheddar Cheese");
        toppings.add("Pepperoni");
    }
}
