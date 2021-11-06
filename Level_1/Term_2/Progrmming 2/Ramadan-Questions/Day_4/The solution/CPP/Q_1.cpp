#include <iostream>
using namespace std;

int main(void)
{
    short int grade=-1; // هنا لازم نديله قيمة بتحقق شرط اللوب علشان يدخل فيه اول مرة او استعمل دو  وايل لو مش عايز ادي قيمة اولية

    // Read grade from user if <= 100 and >= 0
    while(grade > 100 || grade < 0) // اللوب دي بجبر اليوزر انو يدخل درجة موجبة و مش اكبر من 100
    {
        cout << "Please enter your grade: ";
        cin >> grade;
    }
    // Check grade using switch statment only
    switch(grade/10)
    {
        case 10:
        case 9:
            cout << "Excellence n_n\n";
            break;
        case 8:
            cout << "Very good u_u\n";
            break;
        case 7:
            cout << "Good h_h\n";
            break;
        case 6:
            cout << "Acceptable @_@\n";
            break;
        default:
            cout << "Not so lucky >_<, try again ^_^" << endl;
    }
    return 0;
}
// Programming is very, very fun 🖤
