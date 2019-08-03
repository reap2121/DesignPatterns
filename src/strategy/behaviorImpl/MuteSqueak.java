package strategy.behaviorImpl;

import strategy.behavior.QuackBehavior;

public class MuteSqueak implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("-");
    }
}
