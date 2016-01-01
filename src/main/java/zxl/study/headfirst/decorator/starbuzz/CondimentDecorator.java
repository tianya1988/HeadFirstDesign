package zxl.study.headfirst.decorator.starbuzz;

/**
 * Created by jason on 16-1-2.
 */

/***
 * 调料
 * 此时调料有两个抽象方法
 * 1.重新实现了getDescription()
 * 2.继承了cost()
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
