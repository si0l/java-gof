package com.sub.creational.objectPool;

public class PoolApp {

    public static void main(String[] args) {

        OliphauntPool pool = new OliphauntPool();
        var oliphaunt1 = pool.checkout();
        System.out.println(pool);
        var oliphaunt2 = pool.checkout();
        System.out.println(pool);
        var oliphaunt3 = pool.checkout();
        System.out.println(pool);
        pool.checkIn(oliphaunt1);
        System.out.println(pool);
        pool.checkIn(oliphaunt2);
        System.out.println(pool);
        var oliphaunt4 = pool.checkout();
        System.out.println(pool);
        var oliphaunt5 = pool.checkout();
        System.out.println(pool);
    }
}
