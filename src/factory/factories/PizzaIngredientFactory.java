package factory.factories;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.dough.Dough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauces.Sauce;
import factory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
