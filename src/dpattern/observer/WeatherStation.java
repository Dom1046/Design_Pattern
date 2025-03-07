package dpattern.observer;

import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        NewsReader newsReader = new NewsReader(weatherData);

        weatherData.setMeasurements(80,60,54);
    }
}
