def cond(condition, true, false):
    if condition:
        return true
    else:
        return false


# Read age from user
age = int(input("Please enter your age: "))
# Read name from user
fallName = input("Please enter your first name: ")
# Get first name
name = fallName.split()

# Check age and print result
# Python does not conditional statement clause, so we will use the if and else statement >.<
print("{}".format(cond(age >= 18, "\nWelcome " + name[0].lower().title(),
                       "\nSorry, this service is not available for your age group\nGoodbye ^-^")))
# Programming is very, very fun 🖤
