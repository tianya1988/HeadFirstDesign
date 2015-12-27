package zxl.study.headfirst.duck.ducks;

import zxl.study.headfirst.duck.base.Duck;
import zxl.study.headfirst.duck.behavior.FlyWithWings;
import zxl.study.headfirst.duck.behavior.Quack;

/**
 * Created by jason on 15-12-27.
 */
public class MallardDuck extends Duck {

    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
