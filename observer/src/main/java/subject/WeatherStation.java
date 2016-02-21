package subject;

import observer.Observer;
import subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqf on 16-2-20.
 */
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float tempurature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(tempurature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setWeatherData(Float tempurature, Float humidity, Float pressure) {
        this.tempurature = tempurature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
