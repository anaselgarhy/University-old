# Read numbers from user
num = int(input("Please enter number Of type integer: "))

# Check number
if num % 2 == 0:  # even number
    print("The number you entered ({}) is even".format(num))
    print("Result of the second equation = ", int((num + 4) / 2))
else:  # odd number
    print("The number you entered ({}) is odd".format(num))
    print("Result of the second equation = ", int((num + 2) / 2))
