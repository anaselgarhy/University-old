package com.company;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args){
        int num1, num2, diff;
        Scanner input = new Scanner(System.in);

        // Read numbers from user
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        // Calculate the difference
        diff = num1 - num2;

        // Check difference
        if(diff >= 0)
            System.out.println("The difference is: " + diff);
        else
            System.out.println("The difference is: " + diff * -1); // // بعكس اشارة الفرقبضربة ف سالب واحد


    }
}
