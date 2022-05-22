package com.anas.universty.ds;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Anas", "Ahmed", "Elgarhy"};

        // Sort the array using quick sort (n log n)
        name = quickSort(name);

        // Print the sorted array
        for (String s : name) {
            System.out.println(s);
        }
    }

    private static String[] quickSort(String[] arr) {
        // Base case
        if (arr.length <= 1) {
            return arr;
        }

        // Choose a pivot
        int pivot = arr.length / 2;

        // Partition the array
        String[] left = new String[pivot];
        String[] right = new String[arr.length - pivot];
        for (int i = 0; i < arr.length; i++) {
            if (i < pivot) {
                left[i] = arr[i];
            } else {
                right[i - pivot] = arr[i];
            }
        }

        // Recursively sort the left and right arrays
        left = quickSort(left);
        right = quickSort(right);

        // Merge the left and right arrays
        String[] result = new String[arr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
