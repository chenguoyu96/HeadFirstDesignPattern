package org.chenguoyu.observer.pull;


import org.chenguoyu.observer.pull.observer.CurrentConditionsDisplay;
import org.chenguoyu.observer.pull.subject.WeatherData;

/**
 * @author chenguoyu
 * @date 2018-03-31
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(78, 90, 29.2f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
