package factory.creators;

import factory.products.Pizza;
import factory.products.chicagostyle.ChicagoStyleCheesePizza;
import factory.products.chicagostyle.ChicagoStyleClamPizza;
import factory.products.chicagostyle.ChicagoStylePepperoniPizza;
import factory.products.chicagostyle.ChicagoStyleVeggiePizza;


public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if(item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if(item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
