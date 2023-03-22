package com.sub.behavioral.chain;

import java.util.Scanner;

public class DispenseApp {

    private DispenseChain c1;

    public DispenseApp() {

        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }

    public static void main(String[] args) {

        DispenseApp app = new DispenseApp();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter amount to dispense:");
            String token = input.next();
            if (token.equals("exit")) {
                input.close();

                return;
            } else {

                try {
                    Integer.valueOf(token);
                } catch (NumberFormatException ex) {
                    System.out.println("Amont should be an integer number");

                    continue;
                }
            }
            int amount = Integer.valueOf(token);

            if (amount % 10 > 0) {
                System.out.println("Amount should be in multiple of 10s");
            } else {
                app.c1.dispense(new Currency(amount));
            }
        }

    }

}
