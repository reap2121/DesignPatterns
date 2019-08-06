package factory.creators;

import factory.products.Pizza;
import factory.products.nystyle.NYStyleCheesePizza;
import factory.products.nystyle.NYStyleClamPizza;
import factory.products.nystyle.NYStylePepperoniPizza;
import factory.products.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if(item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if(item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
