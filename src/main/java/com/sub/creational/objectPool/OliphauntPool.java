package com.sub.creational.objectPool;

public class OliphauntPool extends ObjectPool<Oliphaunt> {

    protected Oliphaunt create() {

        return new Oliphaunt();
    }

}
