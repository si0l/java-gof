package com.sub.behavioral.chain;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;
    private int DENOMINATION = 10;

    @Override
    public void setNextChain(DispenseChain chain) {

        nextChain = chain;

    }

    @Override
    public void dispense(Currency currency) {

        Dispense.dispense(currency, DENOMINATION, nextChain);

    }

}
