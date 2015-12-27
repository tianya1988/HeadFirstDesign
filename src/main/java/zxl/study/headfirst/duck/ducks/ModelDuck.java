package zxl.study.headfirst.duck.ducks;

import zxl.study.headfirst.duck.base.Duck;
import zxl.study.headfirst.duck.behavior.FlyNoWay;
import zxl.study.headfirst.duck.behavior.Quack;

/**
 * Created by jason on 15-12-27.
 */
public class ModelDuck  extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck !");
    }
}
