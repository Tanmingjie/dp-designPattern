package com.olivert.innerclass;

public class OuterClass {

    public OuterClass(){
        System.out.println("构造器");
    }

    public void doSomething(){
        System.out.println("doSomething");
        InnerClass.getInstance().doSomethingInnerClass();
    }

    private static class InnerClass{
        static {
            System.out.println("load innerClass");
        }
        private static final InnerClass inner = new InnerClass();

        public static InnerClass getInstance() {
            return inner;
        }
        private void doSomethingInnerClass(){
            System.out.println("doSomethingInnerClass");
            System.out.println(inner);
        }
    }
}
