package zxl.study.headfirst.duck.behavior;

/**
 * Created by jason on 15-12-27.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
