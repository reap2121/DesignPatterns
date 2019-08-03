package strategy.ducks;

import strategy.behaviorImpl.FlyNoWay;
import strategy.behaviorImpl.Squeak;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
