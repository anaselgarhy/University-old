package com.company;

import java.util.Random;

public class Q_8 {
    public static void main(String[] args){
        int num1 = getRandomNumber(), num2 = getRandomNumber();

        // Print sine of the sum num1 and num2
        System.out.println("Sine(" + (num1+num2) + ") = " + Math.sin(Math.toRadians(num1+num2)));
        // Print cosine of the sum num1 and num2
        System.out.println("Cosine(" + (num1 + num2) + ") = " + Math.cos(Math.toRadians(num1 + num2)));
    }
    static int getRandomNumber(){
        Random rand = new Random();
        return (rand.nextInt(20)+1);
    }
}
