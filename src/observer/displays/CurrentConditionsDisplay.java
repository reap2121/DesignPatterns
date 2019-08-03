package observer.displays;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private double _temperature;
    private double _humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + _temperature + "C degrees and " + _humidity + "% humidity");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        _temperature = temperature;
        _humidity = humidity;
        display();
    }
}
