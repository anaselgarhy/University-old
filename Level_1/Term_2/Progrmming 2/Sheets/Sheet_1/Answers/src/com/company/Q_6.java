package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(".####");
        float r;

        // Read radius from user
        System.out.print("Please enter radius: ");
        r = input.nextFloat();

        // Print volume
        System.out.println("Volume = " + format.format(Math.PI * (4/3) * Math.pow(r, 3)));
        // Print surface area
        System.out.println("Surface area = " + format.format(Math.pow(r, 2) * 4 * Math.PI));

    }
}
