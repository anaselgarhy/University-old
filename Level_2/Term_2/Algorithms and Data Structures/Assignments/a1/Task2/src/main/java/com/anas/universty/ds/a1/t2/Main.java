package com.anas.universty.ds.a1.t2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1 : " +
                test(new String[]{"<div>", "<h1>", "Algorithms are Fun", "</h1>", "</div>"}));

        System.out.println("Test 2 : " +
                test(new String[]{"<div>", "<span>", "</div>", "</span>"}));

        System.out.println("Test 3 : " +
                test(new String[]{"<html>", "</head>", "<head>", "</html>"}));

        System.out.println("Test 4 : " +
                test(new String[]{"<html>", "<head>", "</head>", "</body>", "<body>"}));

        // My name and id
        System.out.println("-------------------------------------------------------");
        System.out.println("My name is Anas Elgarhy");
        System.out.println("My id is: 20-00864");
    }

    private static String test(String[] html) {
        if (HTMLChecker.check(html))
            return "Html is valid";
        else
            return "Html is invalid";
    }
}
