package zxl.study.headfirst.duck.behavior;

import zxl.study.headfirst.duck.behavior.FlyBehavior;

/**
 * Created by jason on 15-12-27.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying !");
    }
}
