package observer.displays;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private double _temperature;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg temperature: " + _temperature);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        _temperature = temperature;
        display();
    }
}
