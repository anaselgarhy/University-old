package com.company;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);

        // Read numbers from user
        System.out.print("Please enter number Of type integer: ");
        num = input.nextInt();

        // Check number
        if(num % 2 == 0) { // even number
            System.out.println("The number you entered (" + num + ") is even");
            System.out.println("Result of the second equation = " + (num + 4)/ 2);
        }
        else{ // odd number
            System.out.println("The number you entered (" + num + ") is odd");
            System.out.println("Result of the first equation = " + (num + 3)/ 2);
        }

    }
}
