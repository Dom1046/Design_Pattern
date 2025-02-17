package dpattern.observer;

public interface Observer {
    //기상정보가 변경되었을 때 옵저버들이 변경되는 값들 / 메서드
    public void update(float temp, float humidity, float pressure);
}
