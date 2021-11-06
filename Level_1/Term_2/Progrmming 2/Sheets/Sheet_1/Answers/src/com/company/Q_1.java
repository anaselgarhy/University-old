package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String city, country;

        // Read data from user
        System.out.print("Please enter your city: ");
        city = input.nextLine();
        System.out.print("Please enter your country: ");
        country = input.nextLine();

        // Print
        System.out.printf("%s,%s%d",country.substring(0,2), city, rand.nextInt(100)+1);


    }
}
