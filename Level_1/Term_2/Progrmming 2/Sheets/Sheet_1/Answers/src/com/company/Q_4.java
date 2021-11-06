package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        // Read integer number from user
        System.out.print("Please enter integer number: ");
        num = input.nextInt();

        // Print e^num
        //System.out.println("e^" + num + " = " + Math.exp(num));
        //If you want me to print the values rounded to 6 digits after the decimal point
        DecimalFormat format = new DecimalFormat(".######");
        System.out.println("e^" + num + " = " + format.format(Math.exp(num)));

    }
}
