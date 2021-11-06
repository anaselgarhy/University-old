#include <iostream>
using namespace std;

int main()
{
    int num;

    // Read number from user
    cout << "Please enter number Of type integer: ";
    cin >> num;

    // Check number positive or negative
    if(num > 0)
        cout << "Number is positive" << endl;
    else
        cout << "Number is negative" << endl;

    // Check number even or odd
    if(num % 2 == 0)
        cout << "And number is even" << endl;
    else
        cout << "And number is odd" << endl;
    return 0;
}
