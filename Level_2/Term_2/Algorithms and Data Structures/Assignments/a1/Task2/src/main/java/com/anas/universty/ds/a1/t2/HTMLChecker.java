package com.anas.universty.ds.a1.t2;

import java.util.Stack;

public class HTMLChecker {
    public static boolean check(String[] html) {
        Stack<String> stack = new Stack<String>();
        for (String s : html) {
            if (s.endsWith(">")) {
                if (s.startsWith("</")) {
                    // check if s is closing tag
                    if (stack.isEmpty())
                        return false;
                    String top = stack.pop();
                    // check if s is closing tag of top of stack
                    if (!top.substring(1, top.length() - 1).equals(s.substring(2, s.length() - 1)))
                        return false;
                } else if (s.startsWith("<")) {
                    stack.push(s); // push opening tag into stack
                }
            }
        }
        return stack.isEmpty();
    }
}
