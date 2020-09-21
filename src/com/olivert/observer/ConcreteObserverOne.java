package com.olivert.observer;

public class ConcreteObserverOne implements Observer {

    @Override
    public void update(String message) {
        System.out.println(message);
    }

}
