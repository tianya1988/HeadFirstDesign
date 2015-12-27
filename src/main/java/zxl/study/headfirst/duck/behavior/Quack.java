package zxl.study.headfirst.duck.behavior;

/**
 * Created by jason on 15-12-27.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack , quack, quack !");
    }
}
