package com.sub.behavioral.state;

import java.util.Scanner;

public class StateApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter connection type, please:");
            String inputText = input.nextLine();
            if (inputText.equals("exit")) {

                input.close();
                return;
            }

            Controller controller = new Controller();
            boolean found = switch (inputText) {
                case "accounting" -> {
                    controller.setAccountingConnection();
                    yield true;
                }
                case "sales" -> {
                    controller.setSalesConnection();
                    yield true;
                }
                default -> {
                    System.out.println("Type not found, please select from accounting or sales");
                    yield false;
                }
            };

            if (found) {
                controller.open();
                controller.update();
                controller.close();
            }

        }

    }

}
