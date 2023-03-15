package com.sub.creational.singleton;

import java.util.Arrays;
import java.util.List;

public class SingletonExample {

    private static SingletonExample obj;
    private List<String> names;

    private SingletonExample() {

        this.names = Arrays.asList("Pete", "Alex", "John");

    }

    public static SingletonExample getSingletonExample() {

        if (obj == null) {
            synchronized (SingletonExample.class) {
                if (obj == null) {
                    obj = new SingletonExample();
                }
            }
        }

        return obj;

    }

    public List<String> getNames() {

        return names;

    }

}
