package factory.products.chicagostyle;

import factory.products.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Stlye Sauce and Pepperoni Pizza";
        dough = "Thick Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Cheddar Cheese");
        toppings.add("Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
