# Loops and ranges:

# 1) Sum of digits in the numbers
#  -> for loop
#  	- convert the int to str and loop into it.
#  	- then add each element to the total by converting the str to int
#  	- print the total value

#  -> While loop
#  	- the loop must stop when the number becomes 0.
#  	- take the last digit and add it to the total  => num % 10
#  	- then reduce the last digit from the number => num // 10
#  	- print the total


num = 345234

total = 0

for i in str(num):

    total += int(i)

print(total)


while num > 0:

    last = num % 10

    total += last
    num //= 10

print(total)
