package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize the variables
        byte option;
        float num1 = 0.0f, num2 = 0.0f, result = 0.0f;
        while (true) {
            // Hello
            System.out.println("Shape calculator sys: Hi!\nChose the shape you want to calculate the area:");
            // Print the menu
            System.out.println("[1] Triangle\n[2]Square\n[3]Circle\n\n[4]Exit");
            System.out.print("> ");
            // Take the chose from user
            option = takeTheOption();
            // take numbers
            switch (option) {
                case 1 -> {
                    for (int i = 1; i < 3; i++) {
                        System.out.print("Enter the " + (i == 1 ? "b" : "h") + " number: ");
                        switch (i) {
                            case 1 -> num1 = readNumber();
                            case 2 -> num2 = readNumber();
                        }
                    }
                    result = 0.5f * num1 * num2;
                }
                case 2 -> {
                    System.out.print("Enter the length: ");
                    num1 = readNumber();
                    result = num1 * num1;
                }
                case 3 -> {
                    System.out.print("Enter the radius: ");
                    num1 = readNumber();
                    result = num1 * num1 * (float) Math.PI;
                }
                case 4 -> {
                    System.out.println("Goodbye n_n");
                    System.exit(0);
                }
            }

            // Print result
            printResult(result, option);
        }
    }

    private static byte takeTheOption() {
        byte option;
        while ((option = (byte) readNumber()) < 0 || option > 3)
            System.out.print("Warning option, try again: ");
        return option;
    }

    private static float readNumber() {
        float number;
        while (true) {
            try {
                number = input.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Enter numbers only!\n> ");
                input.nextLine(); // free buffer
            }
        }
        return number;
    }

    private static void printResult(float result, byte option) {
        String shape = (option == 1 ? "Triangle" : (option == 2 ? "Square" : "Circle"));
        // print
        System.out.println(shape + " Area = " + result);
        System.out.println("-----------------------------");
    }
}
