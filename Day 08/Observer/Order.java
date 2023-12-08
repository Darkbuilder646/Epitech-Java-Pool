package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private String position;
    private String destination;
    private int timeBeforeArrival;
    private List<Observer> observers;

    public Order() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean notifyObservers() {
        for (Observer observer : observers) {
            if (observer != null) {
                observer.update(this);
            } else {
                return false;
            }
        }
        return true;
    }

    public void setData(String position, String destination, int time) {
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = time;
        notifyObservers();
    }

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }
    
}
