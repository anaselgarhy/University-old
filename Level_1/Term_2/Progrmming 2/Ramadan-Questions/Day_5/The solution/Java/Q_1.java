package com.company; // If you encounter a problem running the code, delete this line

import java.util.Scanner;

public class Q_1 { // If you encounter a problem running the code, change the file name to "Q_1.java"
    public static void main(String[] args) {
        short op=0;
        float num1, num2;
        Scanner input = new Scanner(System.in);

        // Main loop
        while(op != 5){
            // Welcome
            System.out.println("Welcome, Choose the operation you want to perform:");
            // print list operations
            System.out.println("[1] Sum \n[2] Subtraction \n[3] Multiply \n[4] Division\n[5] Exit");
            // Read choose from user
            System.out.print("> ");
            op = input.nextShort();
            // Check The correctness of choose
            if(op < 5 && op > 0)
            {
                // Read numbers
                System.out.print("Enter first number: ");
                num1 = input.nextFloat();
                System.out.print("Enter second number: ");
                num2 = input.nextFloat();
                System.out.println("-------------------------");
                // Check choose
                switch(op)
                {
                    case 1:
                        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
                        break;
                    case 2:
                        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
                        break;
                    case 3:
                        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
                        break;
                    case 4:
                        // Check the numbers to make sure that zero is not equal
                        if(num2 == 0)
                            System.out.println("Cannot divide by zero!");
                        else
                            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
                        break; // مافيش لازمة ليها لانها اخر كيس
                    // وبرضو مافيش لازمة من ديفلت لاني متأكد مئة بالمئة انو لو وصل لهنا يبقا الخيار صح
                }
            }
            else if(op == 5)
                System.out.println("Thanks for using this program, bye n_n");
            else
                System.out.print("\nWrong choice"); // Print wrong massage
            System.out.println("-------------------------");
        }
    }
}
// Programming is very, very fun 🖤
