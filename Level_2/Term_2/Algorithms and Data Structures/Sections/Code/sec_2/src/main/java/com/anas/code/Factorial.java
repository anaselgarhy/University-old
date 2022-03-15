package com.anas.code;

public class Factorial {
    private int factRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factRec(n - 1);
    }

    private int factIter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 5 using recursion: " + factorial.factRec(5));
        System.out.println("Factorial of 5 using iteration: " + factorial.factIter(5));
    }
}
