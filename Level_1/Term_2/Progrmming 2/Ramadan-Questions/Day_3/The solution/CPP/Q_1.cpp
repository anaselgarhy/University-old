#include <iostream>
using namespace std;

int main(void)
{
    short int op;
    float num1, num2;

    // Welcome
    cout << "Welcome, Choose the operation you want to perform:" << endl;
    // print list operations
    cout << "[1] Sum \n[2] Subtraction \n[3] Multiply \n[4] Division" << endl;
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
                if(num1 == 0 || num2 == 0)
                    cout << "Cannot divide by zero!\n";
                else
                    cout << num1 << " / " << num2 << " = " << num1 / num2 << endl;
                break; // مافيش لازمة ليها لانها اخر كيس
            // وبرضو مافيش لازمة من ديفلت لاني متأكد مئة بالمئة انو لو وصل لهنا يبقا الخيار صح
       }
       // Print thanks massage
       cout << "\nThank you for using this program n_n" << endl;
   }
   else
    cout << "\nWrong choice,"; // Print wrong massage
   cout << "And Goodbye b_n" << endl; // Bay
    return 0;
}
// Programming is very, very fun 🖤
