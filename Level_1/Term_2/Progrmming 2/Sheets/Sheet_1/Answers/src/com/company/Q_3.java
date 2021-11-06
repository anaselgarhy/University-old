package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Q_3 {
    public static void main(String[] args){
        Random rand = new Random();
        DecimalFormat format1 = new DecimalFormat("000");
        DecimalFormat format2 = new DecimalFormat("0000");
        int num1, num2, num3;

        // Generate a random phone number
        // Generate a random num1
        num1 = (rand.nextInt(7)+1) *100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        // Generate a random num2
        num2 = rand.nextInt(656);
        // Generate a random num3
        num3 = rand.nextInt(10000);

        //Print generate phone number 
        System.out.println(num1 + "-" + format1.format(num2) + "-" + format2.format(num3));
    }
}
