package org.chenguoyu.observer.pull;

import java.util.Observable;

/**
 * @author chenguoyu
 * @date 2018-03-31
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
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
