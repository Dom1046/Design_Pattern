package dpattern.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    //순서 2
    public void measurementsChanged() { //새로운 메서드에 notifyObservers를 담은 이유
        //유지 보수성 + 메서드명 + 로깅시 메서드 자유롭게 수정하기 위함이다.
        //클린코드 1장의 명확한 메서드명 만들기에 대한 내용과 관련됨.
        setChanged();
        notifyObservers();
    }
    //순서 1
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
