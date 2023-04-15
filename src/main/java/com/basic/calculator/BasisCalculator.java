package com.basic.calculator;

import java.util.Scanner;

public class BasisCalculator {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Welcome to your calculator");

        System.out.print("Enter first number: ");
        float number1 = consoleInput.nextFloat();
        System.out.print("Enter second number: ");
        float number2 = consoleInput.nextFloat();

        boolean badInput = false;

        do {
            System.out.println("Would you like to 'add', 'subtract', 'multiply', or 'divide'? ");
            String command = consoleInput.next();

            if (command.equalsIgnoreCase("add")) {
                float result = number1 + number2;
                System.out.print("The result is: " + result);
                break;
            } else if (command.equalsIgnoreCase("subtract")) {
                float result = number1 - number2;
                System.out.print("The result is: " + result);
                break;
            } else if (command.equalsIgnoreCase("multiply")) {
                float result = number1 * number2;
                System.out.print("The result is: " + result);
                break;
            } else if (command.equalsIgnoreCase("divide")) {
                float result = number1 / number2;
                System.out.print("The result is: " + result);
                break;
            } else {
                System.out.println("I didn't understand that... Please try again ");
                badInput = true;
            }
        } while (badInput);
    }
}
