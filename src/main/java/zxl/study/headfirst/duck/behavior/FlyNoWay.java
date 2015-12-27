package zxl.study.headfirst.duck.behavior;

/**
 * Created by jason on 15-12-27.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly !");
    }
}
