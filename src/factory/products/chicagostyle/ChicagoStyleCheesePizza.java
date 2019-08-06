package factory.products.chicagostyle;

import factory.products.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded mozarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
