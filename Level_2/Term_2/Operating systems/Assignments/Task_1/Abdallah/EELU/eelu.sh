#!/bin/bash

echo "Enter num 1: "
read num1

echo "Enter num 2: "
read num2

if [[ $((num1 % 2)) == 1 ]]
then
    echo "Number 1 is odd"
else
    echo "Number 1 is even"
fi

if [[ $((num2 % 2)) == 1 ]]
then
    echo "Number 2 is odd"
else
    echo "Number 2 is even"
fi
