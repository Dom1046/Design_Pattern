package dpattern.observer;

public interface Subject {
    public void registerObserver(Observer o); // 등록
    public void removeObserver(Observer o); // 삭제
    public void notifyObservers(); // Subject가 변경되었을 때 모든 옵저버들에게 알리기 위한 메서드

}
