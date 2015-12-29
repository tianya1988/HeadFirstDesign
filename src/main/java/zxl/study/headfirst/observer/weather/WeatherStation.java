package zxl.study.headfirst.observer.weather;

/**
 * Created by jason on 15-12-30.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("========= data change ==============");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("========= data change ==============");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("========= data change ==============");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
