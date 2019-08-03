package strategy.ducks;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior _flyBehavior){
        flyBehavior = _flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior _quackBehavior) {
        quackBehavior = _quackBehavior;
    }
}
