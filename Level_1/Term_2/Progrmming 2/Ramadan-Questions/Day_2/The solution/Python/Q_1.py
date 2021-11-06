# Read grade from user
grade = int(input("Please enter your grade: "))

# Check grade using if and elif(else if) and else only
if grade >= 90:
    print("Excellence n_n")
elif grade >= 80:
    print("Very good u_u")
elif grade >= 70:
    print("Good h_h")
elif grade >= 60:
    print("Acceptable @_@")
else:
    print("Not so lucky >_<, try again ^_^")
