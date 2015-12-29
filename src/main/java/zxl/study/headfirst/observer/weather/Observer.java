package zxl.study.headfirst.observer.weather;

/**
 * Created by jason on 15-12-30.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
