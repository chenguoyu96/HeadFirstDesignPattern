package org.chenguoyu.observer.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
