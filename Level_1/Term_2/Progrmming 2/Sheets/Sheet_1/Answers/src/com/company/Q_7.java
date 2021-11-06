package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(".##");
        float a, b, h;

        // Read tow sides from user
        System.out.print("Please enter a side: ");
        a = input.nextFloat();
        System.out.print("Please enter b side: ");
        b = input.nextFloat();
        // Read height of the trapezoid from user
        System.out.print("Please enter height of the trapezoid: ");
        h = input.nextFloat();

        //Print area
        System.out.println("Area = " + format.format(((a + b) / 2) * h));
    }
}
