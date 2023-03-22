package com.sub.behavioral.stratagy;

import java.util.Scanner;

public class StrategyApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("first float value:");
            Float f1 = scanner.nextFloat();

            System.out.println("second float value:");
            Float f2 = scanner.nextFloat();

            Context c1 = new Context(new Addition());
            System.out.println("addition result: " + c1.executeStrategy(f1, f2));

            Context c2 = new Context(new Substraction());
            System.out.println("substraction result: " + c2.executeStrategy(f1, f2));
        }

    }

}
