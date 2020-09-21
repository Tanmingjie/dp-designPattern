package com.olivert.singleton;

public class HungryManSingleton {

    private static final HungryManSingleton singleton = new HungryManSingleton();

    private HungryManSingleton(){
        super();
    }

    public static HungryManSingleton getLazybonesSingleton() {
        return singleton;
    }
}
