package com.olivert.singleton;

public class EnumSingleton {

    private EnumSingleton(){}

    enum SingletonEnum {
        INSTANCE;

        private final EnumSingleton enumSingleton;

        SingletonEnum(){
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getEnumSingleton() {
            return enumSingleton;
        }

    }

    public static EnumSingleton getInstance(){
        return SingletonEnum.INSTANCE.getEnumSingleton();
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.getInstance());
        System.out.println(EnumSingleton.getInstance());
        System.out.println(EnumSingleton.getInstance() == EnumSingleton.getInstance());
    }

}
