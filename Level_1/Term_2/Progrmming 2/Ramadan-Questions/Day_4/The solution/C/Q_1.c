#include <stdio.h>

void main(void)
{
    short int grade=-1; // هنا لازم نديله قيمة بتحقق شرط اللوب علشان يدخل فيه اول مرة او استعمل دو  وايل لو مش عايز ادي قيمة اولية

    // Read grade from user if <= 100 and >= 0
    while(grade > 100 || grade < 0) // اللوب دي بجبر اليوزر انو يدخل درجة موجبة و مش اكبر من 100
    {
        printf("Please enter your grade: ");
        scanf("%d", &grade);
    }
    // Check grade using switch statment only
    switch(grade/10)
    {
        case 10:
        case 9:
            printf("Excellence n_n\n");
            break;
        case 8:
            printf("Very good u_u\n");
            break;
        case 7:
            printf("Good h_h\n");
            break;
        case 6:
            printf("Acceptable @_@\n");
            break;
        default:
            printf("Not so lucky >_<, try again ^_^\n");
    }
}
// Programming is very, very fun 🖤
