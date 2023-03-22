package com.sub.behavioral.chain;

public interface DispenseChain {
 
    public void setNextChain(DispenseChain chain);

    public void dispense(Currency currency);

}
