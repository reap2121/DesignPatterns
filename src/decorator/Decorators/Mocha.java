package decorator.Decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage _beverage;

    public Mocha(Beverage beverage) {
        _beverage = beverage;
    }

    @Override
    public String getDescription() {
        return _beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + _beverage.cost();
    }
}
