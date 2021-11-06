# Read numbers from user
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

# Calculate the difference
diff = num1 - num2

# Check difference
if diff >= 0:
    print("The difference is: ", diff)
else:
    print("The difference is: ", diff * -1)
