package org.example;

public class Main {
    public static void main(String[] args) {
        String[] myName = {"Shady", "Ashraf", "lahzay"};

        // Sort the array with the insertion sort algorithm
        insertionSort(myName);

        // Print the sorted array
        for (String name : myName) {
            System.out.println(name);
        }
    }

    // Time complexity: O(n^2)
    private static void insertionSort(String[] myName) {
        for (int i = 1; i < myName.length; i++) {
            String key = myName[i];
            int j = i - 1;
            while (j >= 0 && myName[j].compareTo(key) > 0) {
                myName[j + 1] = myName[j];
                j--;
            }
            myName[j + 1] = key;
        }
    }
}
