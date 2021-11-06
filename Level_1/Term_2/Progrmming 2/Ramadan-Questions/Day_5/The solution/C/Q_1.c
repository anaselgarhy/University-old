#include <stdio.h>

void main(void)
{
    short int op =0;
    float num1, num2;

    // Main loop
    while(op != 5)
    {
        // Welcome
        printf("Welcome, Choose the operation you want to perform:\n");
        // print list operations
        printf("[1] Sum \n[2] Subtraction \n[3] Multiply \n[4] Division\n[5] Exit\n");
        // Read choose from user
        printf("> ");
        scanf("%d", &op);

        // Check The correctness of choose
       if(op < 5 && op > 0)
       {
           // Read numbers
           printf("Enter first number: ");
           scanf("%f", &num1);
           printf("Enter second number: ");
           scanf("%f", &num2);
           printf("-------------------------\n");
           // Check choose
           switch(op)
           {
                case 1:
                    printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
                    break;
                case 2:
                    printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
                    break;
                case 3:
                    printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
                    break;
                case 4:
                    // Check the numbers to make sure that zero is not equal
                    if(num2 == 0)
                        printf("Cannot divide by zero!\n");
                    else
                        printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
                    break; // مافيش لازمة ليها لانها اخر كيس
                // وبرضو مافيش لازمة من ديفلت لاني متأكد مئة بالمئة انو لو وصل لهنا يبقا الخيار صح
           }
       }
       else if(op == 5)
        printf("Thanks for using this program, bye n_n\n"); // Bye
       else
        printf("\nWrong choice,"); // Print wrong massage
    printf("-------------------------\n");
    }
}
// Programming is very, very fun 🖤
