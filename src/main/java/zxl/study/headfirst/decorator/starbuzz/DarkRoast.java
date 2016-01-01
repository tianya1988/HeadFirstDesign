package zxl.study.headfirst.decorator.starbuzz;
/**
 * Created by jason on 16-1-2.
 */

/**
 * 饮料：深焙（bei）
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

