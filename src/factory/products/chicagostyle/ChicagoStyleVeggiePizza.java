package factory.products.chicagostyle;

import factory.products.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Stlye Veggie Pizza";
        dough = "Thin Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Cheese");
        toppings.add("Vegetables");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
