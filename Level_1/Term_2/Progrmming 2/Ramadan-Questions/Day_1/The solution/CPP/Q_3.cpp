#include <iostream>
using namespace std;

int main()
{
    int num;

    // Read inputs from user
    cout << "Please enter number Of type integer: ";
    cin >> num;

    if(num % 2 == 0){
        cout << "The number you entered (" << num << ") is even" <<endl;
        cout << "Result of the second equation = " << (num + 4)/2 <<endl;
    }
    else{
        cout << "The number you entered (" << num << ") is odd" <<endl;
        cout << "Result of the first equation = " << (num + 3)/2 <<endl;
    }
    return 0;
}
