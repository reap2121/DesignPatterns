package factory.products.chicagostyle;

import factory.products.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Stlye Clam Pizza";
        dough = "Thin Dough";
        sauce = "Tomato Sauce";

        toppings.add("Mozarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
