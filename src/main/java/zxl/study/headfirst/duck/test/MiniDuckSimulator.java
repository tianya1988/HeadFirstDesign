package zxl.study.headfirst.duck.test;

import zxl.study.headfirst.duck.base.Duck;
import zxl.study.headfirst.duck.behavior.FlyRocketPowered;
import zxl.study.headfirst.duck.ducks.MallardDuck;
import zxl.study.headfirst.duck.ducks.ModelDuck;

/**
 * Created by jason on 15-12-27.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        /**
         * 测试1
         */
        /*
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        */

        /**
         * 测试2
         */
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
