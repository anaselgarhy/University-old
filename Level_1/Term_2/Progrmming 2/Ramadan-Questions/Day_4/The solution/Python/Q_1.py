grade = -1  # هنا لازم نديله قيمة بتحقق شرط اللوب علشان يدخل فيه اول مرة او استعمل دو  وايل لو مش عايز ادي قيمة اولية
# Read grade from user if <= 100 and >= 0
while grade > 100 or grade < 0:  # اللوب دي بجبر اليوزر انو يدخل درجة موجبة و مش اكبر من 100
    grade = int((int(input("Please enter your grade: ")) / 10))
# Check grade using switch statement only
# Python does not contain a switch clause, so we will use the if and elif statement >.<
if grade == 10 or grade == 9:
    print("Excellence n_n")
elif grade == 8:
    print("Very good u_u")
elif grade == 7:
    print("Good h_h")
elif grade == 6:
    print("Acceptable @_@")
else:
    print("Not so lucky >_<, try again ^_^")
# Programming is very, very fun 🖤
