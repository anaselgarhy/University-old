package com.company;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0, num3=0;

        // Read 3 numbers from user
        for(short i = 1; i<=3; i++)
        {
            System.out.printf("Enter number[%d]: ", i);
            switch(i){
                case 1 -> num1 = input.nextInt();
                case 2 -> num2 = input.nextInt();
                case 3 -> num3 = input.nextInt();
            }
        }
        //Print result
        System.out.printf("(%d * %d * %d)^2 = %d", num1, num2, num3, (int)Math.pow(num1*num2*num3,2));
    }
}
