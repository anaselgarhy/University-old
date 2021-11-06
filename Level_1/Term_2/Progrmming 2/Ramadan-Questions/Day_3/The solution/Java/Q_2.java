package com.company; // If you encounter a problem running the code, delete this line

import java.util.Scanner;

public class Q_2 { // If you encounter a problem running the code, change the file name to "Q_1.java"
    public static void main(String[] args){
        short age;
        String name;
        Scanner input = new Scanner(System.in);

        // Read age from user
        System.out.print("Please enter your age: ");
        age = input.nextShort();
        // Read name from user
        System.out.print("Please enter your first name: ");
        name = input.next(); // read one token as a string

        // Check age and print result
        System.out.printf("%s", (age >= 18)? ("\nWelcome "+name) : "\nSorry, this service is not available for your age group\nGoodbye ^-^");

    }
}
// Programming is very, very fun 🖤