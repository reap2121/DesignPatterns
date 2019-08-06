package decorator.Decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage _beverage;

    public Soy(Beverage beverage) {
        _beverage = beverage;
    }

    @Override
    public String getDescription() {
        return _beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .25 + _beverage.cost();
    }
}
