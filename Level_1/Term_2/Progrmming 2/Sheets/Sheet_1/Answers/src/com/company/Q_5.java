package com.company;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float x_1=0, y_1=0, x_2=0, y_2=0;

        // Read x and y from user
        for(short i=1; i<=2; i++)
        {
            System.out.printf("Point [%d]:\n", i);
            System.out.print("Please enter x value: ");
            if(i == 1)
                x_1 = input.nextFloat();
            else
                x_2 = input.nextFloat();
            System.out.print("Please enter y value: ");
            if(i == 1)
                y_1 = input.nextFloat();
            else
                y_2 = input.nextFloat();
        }
        // Check x_2 - x_1 != 0
        if(x_2 - x_1 != 0)
            // Print slope of the line
            System.out.println("Slope of the line = " + ((y_2 - y_1)/(x_2 - x_1)));
        else
            System.out.println("Cannot divide by zero");
    }
}
