package org.example.t2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Shady Ashraf lahzay");
        System.out.println("ID: 20-01310");
        //correct
        String[] html1 = {"<div>", "<h1>", "Algorithms are Fun", "</h1>", "</div>"};
        //not correct
        String[] html2 = {"<html>", "<head>", "</head>", "<body>", "</body>"};
        String[] html3 = {"<html>", "</head>", "<head>", "</html>"};
        String[] html4 = {"<div>", "<span>", "</div>", "</span>"};

        // Check html 1
        cheackHtml(html1);

        // Check html 2
        cheackHtml(html2);

        // Check html 3
        cheackHtml(html3);

        // Check html 4
        cheackHtml(html4);
    }

    private static void cheackHtml(String[] html) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < html.length; i++) {
            if (html[i].startsWith("</") && html[i].endsWith(">")) {
                if (stack.isEmpty()) {
                    System.out.println("Not valid HTML");
                    return;
                }
                if (!stack.pop().equals(html[i].substring(2, html[i].length() - 1))) {
                    System.out.println("Not valid HTML");
                    return;
                }
            } else if (html[i].startsWith("<") && html[i].endsWith(">")) {
                stack.push(html[i].substring(1, html[i].length() - 1));
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid HTML");
        } else {
            System.out.println("Not valid HTML");
        }
    }
}
