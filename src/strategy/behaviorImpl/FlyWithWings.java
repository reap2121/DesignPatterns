package strategy.behaviorImpl;

import strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
