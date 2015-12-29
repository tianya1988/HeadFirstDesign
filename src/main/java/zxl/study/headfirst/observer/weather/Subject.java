package zxl.study.headfirst.observer.weather;

/**
 * Created by jason on 15-12-30.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
