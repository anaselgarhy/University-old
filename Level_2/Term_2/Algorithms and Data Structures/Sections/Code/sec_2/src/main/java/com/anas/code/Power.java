package com.anas.code;

import java.util.Scanner;

public class Power {
    private final Scanner scanner;

    private Power() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Power power = new Power();
        // Take the base and exponent from the user
        double base = power.takeInput("base");
        double exp = power.takeInput("exponent");

        // Additional future:
        // Calculate the time taken to calculate the power using recursion and iteration
        long recursionTime = System.currentTimeMillis() * 1000; // in nanoseconds
        System.out.println(power.powerRec(base, exp));
        recursionTime = System.currentTimeMillis() * 1000 - recursionTime;
        System.out.println("Recursion took " + recursionTime + " nano seconds");

        long iterationTime = System.currentTimeMillis() * 1000; // in nanoseconds
        System.out.println(power.powerIter(base, exp));
        iterationTime = System.currentTimeMillis() * 1000 - iterationTime;
        System.out.println("Iteration took " + iterationTime + " nano seconds");
    }
    private double takeInput(String prompt) {
        double in = 0.0;
        while (true) {
            try {
                System.out.print("Enter the " + prompt + ": ");
                in = scanner.nextDouble();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
        }
        return in;
    }

    private double powerRec(double base, double exp) {
        if (exp == 0) {
            return 1;
        }
        return base * powerRec(base, exp - 1);
    }

    private double powerIter(double base, double exp) {
        double result = 1;
        while (exp > 0) {
            result *= base;
            exp--;
        }
        return result;
    }
}
