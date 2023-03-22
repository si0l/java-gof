package com.sub.behavioral.chain;

public class Dispense {

    public static void dispense(Currency currency, int denomination, DispenseChain chain) {

        if (currency.amount() >= denomination) {
            int number = currency.amount() / denomination;
            int remainder = currency.amount() % denomination;

            System.out.println("Dispensing " + number + " " + denomination + "$ note");

            if (remainder > 0) {
                chain.dispense(new Currency(remainder));
            }
        } else {
            chain.dispense(currency);
        }

    }

}
