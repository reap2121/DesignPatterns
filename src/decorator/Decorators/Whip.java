package decorator.Decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage _beverage;

    public Whip(Beverage beverage) {
        _beverage = beverage;
    }

    @Override
    public String getDescription() {
        return _beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .15 + _beverage.cost();
    }
}
