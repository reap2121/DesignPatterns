package observer;

import observer.displays.CurrentConditionsDisplay;
import observer.displays.ForecastDisplay;
import observer.displays.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30, 60, 10);
        weatherData.setMeasurements(32, 67, 15);
        weatherData.setMeasurements(28, 57, 20);

    }
}
