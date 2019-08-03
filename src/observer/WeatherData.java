package observer;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if(i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temp, double hum, double pres){
        temperature = temp;
        humidity = hum;
        pressure = pres;
        measurementsChanged();
    }




}
