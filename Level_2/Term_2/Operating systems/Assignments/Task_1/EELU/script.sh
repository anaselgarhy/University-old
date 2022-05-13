#!/bin/bash

# Read the numbers from the user
read -p "Enter the number one: " NUM_1
read -p "Enter the number two: " NUM_2

# Check if the number1 is even or odd
if [[ $((NUM_1 % 2)) -eq 0 ]]
then
	echo "Number one is even"
else
	echo "Number one is odd"
fi

# Check if the number2 is even or odd
if [[ $((NUM_2 % 2)) -eq 0 ]]
then
	echo "Number two is even"
else
	echo "Number two is odd"
fi
