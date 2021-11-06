# Welcome
print("Welcome, Choose the operation you want to perform:")
# print list operations
print("[1] Sum \n[2] Subtraction \n[3] Multiply \n[4] Division")
# Read choose from user
op = int(input("> "))
# Check The correctness of choose
if 5 > op > 0:
    # Read numbers
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("-------------------------")
    # Check choose
    # Python does not contain a switch clause, so we will use the if and elif statement >.<
    if op == 1:
        print("{} + {} = {}".format(num1, num2, num1 + num2))
    elif op == 2:
        print("{} - {} = {}".format(num1, num2, num1 - num2))
    elif op == 3:
        print("{} * {} = {}".format(num1, num2, num1 * num2))
    else:
        # Check the numbers to make sure that zero is not equal
        if num1 or num2 == 0:
            print("Cannot divide by zero!")
        else:
            print("{} / {} = {}".format(num1, num2, num1 / num2))
    # Print thanks massage
    print("\nThank you for using this program n_n")
else:
    print("\nWrong choice,")  # Print wrong massage
print("And Goodbye b_n")  # Bye
# Programming is very, very fun 🖤
