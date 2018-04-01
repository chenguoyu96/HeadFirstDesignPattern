package org.chenguoyu.observer.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.22f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay Current currentPressure: " + currentPressure + " and  currentPressure: " + currentPressure);
    }
}
