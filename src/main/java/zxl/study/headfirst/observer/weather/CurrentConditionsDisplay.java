package zxl.study.headfirst.observer.weather;

/**
 * Created by jason on 15-12-30.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement  {

    private float temperature;//温度
    private float humidity;//湿度
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        //需要持有weatherData的引用，方便删除此观察者
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
