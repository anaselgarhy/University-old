package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("BMW");
        cars.add("Sandy");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "bbbb");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

        cars.add("BMW");
        cars.add("Sandy");
        cars.add("BMW");
        cars.add("Sandy");
        cars.add("BMW");
        cars.add("Sandy");

        for(short i=0; i<cars.size(); i++)
            System.out.println(cars.get(i));
    }
}
