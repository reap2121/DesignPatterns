package factory.factories;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.dough.Dough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauces.Sauce;
import factory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
