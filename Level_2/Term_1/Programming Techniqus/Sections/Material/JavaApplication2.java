package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name=scan.next();
        System.out.println("Enter your id: ");
        int id=scan.nextInt();
        Person p=new Person();
        p.setId(id);
        p.setName(name);
        System.out.println("Your name is: "+p.getName());
        System.out.println("Your id is: "+p.getId());
    }
    
}
