#include <iostream>
using namespace std;

int main()
{
    int num1, num2;

    // Read inputs from user
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    // Calculate the difference
    int diff = num1 - num2;
    if(diff >= 0)
        cout << "The difference is: " << diff << endl;
    else
        cout << "The difference is: " << diff * -1 << endl; // بعكس اشارة الفرقبضربة ف سالب واحد
    return 0;
}
