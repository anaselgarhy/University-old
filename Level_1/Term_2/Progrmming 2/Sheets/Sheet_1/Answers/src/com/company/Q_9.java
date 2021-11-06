package com.company;

import java.util.Random;

public class Q_9 {
    public static void main(String[] args){
        int a = getRandomNumber(), b = getRandomNumber(), h = getRandomNumber();
        //Print area
        System.out.println("Area = " + (b * h));
        // Print perimeter
        System.out.println("Perimeter = " + 2*(a + b));
    }
    static int getRandomNumber(){
        Random rand = new Random();
      return (rand.nextInt(20) + 10);
    }
}
