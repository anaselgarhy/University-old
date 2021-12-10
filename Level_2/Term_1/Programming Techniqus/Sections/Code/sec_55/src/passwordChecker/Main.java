package passwordChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the password: ");
        if (checkPassword(new Scanner(System.in).nextLine()))
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }

    private static boolean checkPassword(String password) {
        boolean upper = false, lower = false, digit = false;
        if (password.length() < 6)
            return false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
        }
        return upper && lower && digit;
    }
}
