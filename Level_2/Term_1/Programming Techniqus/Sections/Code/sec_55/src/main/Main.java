package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter name: ");
        p.setName(input.nextLine());

        System.out.print("Enter id: ");
        p.setId(input.nextInt());

        System.out.println(p);
    }
}
