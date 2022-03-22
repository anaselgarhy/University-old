package com.anas.code;


public class Main {

    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>(Integer.class);

        // Read the array from the use
        myArray.readArray();

        // Remove the elements from the array
        myArray.removeElements();

        // Print the array
        myArray.printArray();
    }
}
