package zxl.study.headfirst.decorator.starbuzz;
/**
 * Created by jason on 16-1-2.
 */

/**
 * 饮料：低咖啡因
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

