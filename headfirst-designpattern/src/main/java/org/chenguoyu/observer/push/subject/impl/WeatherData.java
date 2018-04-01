package org.chenguoyu.observer.push.subject.impl;

import org.chenguoyu.observer.push.observer.Observer;
import org.chenguoyu.observer.push.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenguoyu
 * @date 2018-03-31
 */
public class WeatherData implements Subject {
    private List<Observer> obervers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        obervers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        obervers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (obervers.contains(o)) {
            obervers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer oberver : obervers) {
            oberver.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
