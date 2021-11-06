package tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] space = new int[3];
        for (int i = 0; i < space.length; i++) {
            System.out.println("Enter space " + (char)(i + 65) + ": ");
            space[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("The short space between A and B and C = " + ((space[0] + space[1] + space[2]) / 3));
    }
}
