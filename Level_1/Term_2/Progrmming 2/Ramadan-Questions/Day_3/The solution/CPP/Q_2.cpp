#include <iostream>
/*
 using namespace std;
 لو ما كتبتش السطر اللي فوق ده لازم اكتب
 std::
 قبل اي امر استعمله من مكتبة
 iostream
 */
 int main(void)
 {
    unsigned short age; // مافيش عر بالسالب او اكبر من 65,535
    char name[10];

    // Read age from user
    std::cout << "Please enter your age: ";
    std::cin >> age;
    // Read name from user
    std::cout << "Please enter your first name: ";
    std::cin >> name;

    // Check age and print result
    (age >= 18)? std::cout << "\nWelcome " << name : std::cout<< "\nSorry, this service is not available for your age group\nGoodbye ^-^\n";
 }
// Programming is very, very fun 🖤
