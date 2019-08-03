package observer.displays;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private double _temperature;
    private double _humidity;
    private double _pressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Forecast: blabla %.2f %.2f %.2f", _temperature, _humidity, _pressure));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        _temperature = temperature;
        _humidity = humidity;
        _pressure = pressure;
        display();
    }
}
