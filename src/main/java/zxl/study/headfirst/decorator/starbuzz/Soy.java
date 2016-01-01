package zxl.study.headfirst.decorator.starbuzz;
/**
 * Created by jason on 16-1-2.
 */
/**
 * 调料：豆浆
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
