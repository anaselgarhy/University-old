#include <stdio.h>

void main(void)
{
    unsigned short age; // مافيش عر بالسالب او اكبر من 65,535
    char name[10];

    // Read age from user
    printf("Please enter your age: ");
    scanf("%d", &age);
    // Read name from user
    printf("Please enter your first name: ");
    scanf("%s", name); // ما بعتش العنوان لان المتغير نيم من نع بوينتر فا هوا عنوان اصلا

    // Check age and print result
    (age >= 18)? printf("\nWelcome %s", name):printf("\nSorry, this service is not available for your age group\nGoodbye ^-^\n");
}
// Programming is very, very fun 🖤
