package com.company; // If you encounter a problem running the code, delete this line

import java.util.Scanner;

public class Q_1 { // If you encounter a problem running the code, change the file name to "Q_1.java"

    public static void main(String[] args) {
        short grade=-1; // هنا لازم نديله قيمة بتحقق شرط اللوب علشان يدخل فيه اول مرة او استعمل دو  وايل لو مش عايز ادي قيمة اولية
        Scanner input = new Scanner(System.in);

        // Read grade from user if <= 100 and >= 0
        while(grade > 100 || grade < 0) // اللوب دي بجبر اليوزر انو يدخل درجة موجبة و مش اكبر من 100
        {
            System.out.print("Please enter your grade: ");
            grade = input.nextShort();
        }
        // Check grade using switch statement only
        switch(grade/10) {
            case 10:
            case 9:
                System.out.println("Excellence n_n");
                break;
            case 8:
                System.out.println("Very good u_u");
                break;
            case 7:
                System.out.println("Good h_h");
                break;
            case 6:
                System.out.println("Acceptable @_@");
                break;
            default:
                System.out.println("Not so lucky >_<, try again ^_^");
        }
    }
}
// Programming is very, very fun 🖤
