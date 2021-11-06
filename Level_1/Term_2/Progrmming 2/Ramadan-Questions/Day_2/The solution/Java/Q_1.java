package com.company; // If you encounter a problem running the code, delete this line

import java.util.Scanner;

public class Q_1 { // If you encounter a problem running the code, change the file name to "Q_1.java"

    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);

        // Read grade from user
        System.out.print("Please enter your grade: ");
        grade = input.nextInt();

        // Check grade using if and else if and else only
        if(grade >= 90)
            System.out.println("Excellence n_n");
        else if(grade >= 80)
            System.out.println("Very good u_u");
        else if(grade >= 70)
            System.out.println("Good h_h");
        else if(grade >= 60)
            System.out.println("Acceptable @_@");
        else
            System.out.println("Not so lucky >_<, try again ^_^");
    }
}
