package com.olivert.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Oliver Tan.
 * @date 09/17/20.
 */
public class MyIterator<T> {


    public List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public List<T> getList() {
        return list;
    }

    public static void main(String[] args) {
//        MyIterator<String> myIterator = new MyIterator();
//
//        myIterator.add("tt");
//        for (String s : myIterator.getList()) {
//            System.out.println(s);
//        }
//        myIterator.doCirculationWithAdd("ss");
//        for (String s : myIterator.getList()) {
//            System.out.println(s);
//        }

        List names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator iterator1 = names.iterator();
        Iterator iterator2 = names.iterator();
        iterator1.next();
        iterator1.remove();
        iterator2.next(); // 运行结果？

    }

    public void doCirculationWithAdd(T t) {
        for (T s : list) {
            if (s.equals("tt")) {
                list.add(t);
            }
        }
    }

    public void doCirculationWithRemove(T t) {
        for (T s : list) {
            if (s.equals("tt")) {
                list.remove(t);
            }
        }
    }

}
