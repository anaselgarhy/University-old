package com.anas.code;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyArray<T> {
    private final Scanner sc;
    private final Class<T> type;
    private T[] arr;

    public MyArray(Class<T> type) {
        sc = new Scanner(System.in);
        this.type = type;
        arr = (T[]) new Object[0];
    }

    public void removeElements() {
        while (true) {
            try {
                printArray();
                System.out.print("Enter the element index to remove, enter any char to exit: ");
                remove(sc.nextInt());
            } catch (InputMismatchException e) {
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds.");
            }
        }
    }

    public void readArray() {
        ArrayList<T> list = toArrayList(arr);
        while (true) {
            try {
                System.out.print("Enter the element to add, enter any char to exit: ");
                list.add(castInput(sc.next()));
            } catch (InputMismatchException | IllegalArgumentException e) {
                break;
            }
        }
        arr = toArray(list);
    }

    @SuppressWarnings("unchecked")
    private T castInput(String input) {
        T value = null;
        if (type.isAssignableFrom(String.class)) {
            value = (T) input;
        } else if (type.isAssignableFrom(Integer.class)) {
            value = (T) Integer.valueOf(input);
        } else if (type.isAssignableFrom(Boolean.class)) {
            value = (T) Boolean.valueOf(input);
        } else if (type.isAssignableFrom(Double.class)) {
            value = (T) Double.valueOf(input);
        } else {
            throw new IllegalArgumentException("Bad type.");
        }
        return value;
    }

    public void add(T element) {
        ArrayList<T> list = toArrayList(arr);
        list.add(element);
        toArray(list);
    }

    private T[] toArray(ArrayList<T> list) {
        T[] newArr = (T[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    private ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public void remove(int index) {
        ArrayList<T> list = toArrayList(arr);
        list.remove(index - 1);
        arr = toArray(list);
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ": " + arr[i]);
        }
    }
}
