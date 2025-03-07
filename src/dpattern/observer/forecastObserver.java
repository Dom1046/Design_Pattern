package dpattern.observer;

public class forecastObserver implements Observer, DisplayElement{
    private float temperature;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("기온은 "+ temperature + "'C 이며\n"+"습도는 "+humidity+"입니다.") ;
    }

    @Override
    public String toString() {
        return "기상정보";
    }
}
