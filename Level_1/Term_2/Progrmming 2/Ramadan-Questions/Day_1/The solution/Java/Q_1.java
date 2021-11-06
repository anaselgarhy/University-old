package com.company;

import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        
        // Read number from user
        System.out.print("Please enter number Of type integer: ");
        num = input.nextInt();

        // Check number positive or negative
        if(num >= 0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");

        // Check number even or odd
        if(num % 2 == 0)
            System.out.println("And number is even");
        else
            System.out.println("And number is odd");
    }
}
