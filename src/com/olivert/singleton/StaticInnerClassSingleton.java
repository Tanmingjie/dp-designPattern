package com.olivert.singleton;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class InnerClass{
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getSingleton() {
        return InnerClass.singleton;
    }
}
