# -> recursion
# 	- check if the num is 0 if 0 return 0
# 	- wee need the last digit and add the last digit by calling the function recursively and reducing the last number from it.

def main(num):

    if num == 0:
        return 0
# this num % 10 => gives the last digits of the numbers
# adds with the reduced number with the num //10
    return (num % 10) + (main(num // 10))


print(main(12345))
