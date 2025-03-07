package dpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsReader implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public NewsReader(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("기온: "+ temperature + "'C 이며\n"+"습도: "+humidity+" 입니다.") ;
    }
}
