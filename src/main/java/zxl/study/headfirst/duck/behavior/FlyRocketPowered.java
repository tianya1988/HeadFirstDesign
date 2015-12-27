package zxl.study.headfirst.duck.behavior;

/**
 * Created by jason on 15-12-27.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
