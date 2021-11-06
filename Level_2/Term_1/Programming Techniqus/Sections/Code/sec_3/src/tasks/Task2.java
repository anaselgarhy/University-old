package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.println("Enter numbers, enter any character to exit.");
        // Read numbers from user
        while (true) {
            System.out.print("> ");
            int num;
            try {
                num = input.nextInt();
            } catch (InputMismatchException e) {
                break; // stop loop
            }

            // calc
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        // print results
        for (int i = 1; i < 3; i++)
            System.out.printf("The %s number = %d\n", (i == 1? "min" : "max"), (i == 1? min : max));
    }
}
