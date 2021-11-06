#include <iostream>
using namespace std;

int main(void)
{
    short int op = 0;
    float num1, num2;

    // Main loob
    while(op != 5)
    {
        // Welcome
        cout << "Welcome, Choose the operation you want to perform:" << endl;
        // print list operations
        cout << "[1] Sum \n[2] Subtraction \n[3] Multiply \n[4] Division\n[5]Exit" << endl;
        // Read choose from user
        cout << "> ";
        cin >> op;
        // Check The correctness of choose
       if(op < 5 && op > 0)
       {
           // Read numbers
           cout << "Enter first number: ";
           cin >> num1;
           cout << "Enter second number: ";
           cin >> num2;
           cout << "-------------------------" << endl;
           // Check choose
           switch(op)
           {
                case 1:
                    cout << num1 << " + " << num2 << " = " << num1 + num2 << endl;
                    break;
                case 2:
                    cout << num1 << " - " << num2 << " = " << num1 - num2 << endl;
                    break;
                case 3:
                    cout << num1 << " * " << num2 << " = " << num1 * num2 << endl;
                    break;
                case 4:
                    // Check the numbers to make sure that zero is not equal
                    if(num2 == 0)
                        cout << "Cannot divide by zero!\n";
                    else
                        cout << num1 << " / " << num2 << " = " << num1 / num2 << endl;
                    break; // مافيش لازمة ليها لانها اخر كيس
                // وبرضو مافيش لازمة من ديفلت لاني متأكد مئة بالمئة انو لو وصل لهنا يبقا الخيار صح
           }
       }
       else if(op == 5)
        cout << "Thanks for using this program, bye n_n" << endl; //Bye
       else
        cout << "\nWrong choice" << endl; // Print wrong massage
       cout <<  "-------------------------" << endl;
    }
 return 0;
}
// Programming is very, very fun 🖤
