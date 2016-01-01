package zxl.study.headfirst.decorator.starbuzz;

/**
 * Created by jason on 16-1-2.
 */

/**
 * 饮料：浓缩咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
