package org.chenguoyu.observer.push;

import org.chenguoyu.observer.push.observer.impl.CurrentConditionsDisplay;
import org.chenguoyu.observer.push.subject.impl.WeatherData;

/**
 * @author chenguoyu
 * @date 2018-03-31
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
