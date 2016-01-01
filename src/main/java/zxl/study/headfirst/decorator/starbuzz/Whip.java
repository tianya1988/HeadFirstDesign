package zxl.study.headfirst.decorator.starbuzz;
/**
 * Created by jason on 16-1-2.
 */
/**
 * 调料：奶泡
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
