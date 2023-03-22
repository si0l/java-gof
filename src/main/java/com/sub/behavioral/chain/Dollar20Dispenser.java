package com.sub.behavioral.chain;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain nextChain;
    private int DENOMINATION = 20;

    @Override
    public void setNextChain(DispenseChain chain) {

        nextChain = chain;

    }

    @Override
    public void dispense(Currency currency) {

        Dispense.dispense(currency, DENOMINATION, nextChain);

    }

}
