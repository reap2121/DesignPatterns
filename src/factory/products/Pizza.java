package factory.products;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.dough.Dough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauces.Sauce;
import factory.ingredients.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place the pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "pizza";
    }
}
