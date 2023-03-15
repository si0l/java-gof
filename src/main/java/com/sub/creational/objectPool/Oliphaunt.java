package com.sub.creational.objectPool;

import java.util.concurrent.atomic.AtomicInteger;

public class Oliphaunt {

    public static AtomicInteger counter = new AtomicInteger();

    private final int id;

    public Oliphaunt() {

        id = counter.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {

        return "Oliphaunt [id=" + id + "]";
    }

}