package strategy.ducks;

import strategy.behaviorImpl.FlyWithWings;
import strategy.behaviorImpl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
