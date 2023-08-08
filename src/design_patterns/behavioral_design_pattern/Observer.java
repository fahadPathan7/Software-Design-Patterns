package design_patterns.behavioral_design_pattern;

import java.util.ArrayList;

public interface Observer {
    void update(double temp);
}

interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObserver();
}

class Weather implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    double temperature = 32;

    void updateTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class User implements Observer {
    String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public void update(double temp) {
        System.out.println("Notification for " + name + "\ntemperature: " + temp + "\n");
    }
}

class Main4 {
    public static void main(String[] args) {
        Weather weather = new Weather();

        Observer ob1 = new User("Fahad");
        Observer ob2 = new User("Pathan");

        weather.add(ob1);
        weather.add(ob2);

        weather.updateTemperature(35.5);

        weather.remove(ob1);

        weather.updateTemperature(30);
    }
}
