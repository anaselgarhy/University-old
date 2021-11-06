#include <iostream>
using namespace std;

int main()
{
    int grade;

    // Read grade from user
    cout << "Please enter your grade: ";
    cin >> grade;

    // Check grade using if and else if and else only
    if(grade >= 90)
        cout << "Excellence n_n" << endl;
    else if(grade >= 80)
        cout << "Very good u_u" << endl;
    else if(grade >= 70)
        cout << "Good h_h" << endl;
    else if(grade >= 60)
        cout << "Acceptable @_@" << endl;
    else
        cout << "Not so lucky >_<, try again ^_^" << endl;
    return 0;
}
