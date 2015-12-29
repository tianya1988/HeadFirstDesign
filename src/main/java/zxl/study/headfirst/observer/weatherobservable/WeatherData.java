package zxl.study.headfirst.observer.weatherobservable;

import java.util.Observable;

/**
 * Created by jason on 15-12-30.
 */

/**
 * 追踪所有的观察者并通知他们
 * Observable是一个类，不是接口
 *
 * 继承下来的api:
 * addObserver(Observer o)
 * deleteObserver(Observer o)
 * notifyObservers()
 * notifyObservers(Object arg)
 * deleteObservers()//清除所有的观察者
 * setChanged()
 * clearChanged()
 * hasChanged()
 * countObservers()
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        //package java.util.Observable的方法;
        setChanged();
        notifyObservers();//观察者拉取
//        notifyObservers("the data push to observers");//主题推送
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
