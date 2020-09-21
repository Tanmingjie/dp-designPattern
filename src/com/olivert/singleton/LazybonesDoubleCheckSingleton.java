package com.olivert.singleton;

public class LazybonesDoubleCheckSingleton {

    private static volatile LazybonesDoubleCheckSingleton singleton;

    private LazybonesDoubleCheckSingleton(){}

    public LazybonesDoubleCheckSingleton getSingleton() {
        if(singleton == null){
            synchronized (LazybonesDoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new LazybonesDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
