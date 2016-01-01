package zxl.study.headfirst.decorator.starbuzz;

/**
 * Created by jason on 16-1-2.
 */

/**
 * 基类：饮料
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
