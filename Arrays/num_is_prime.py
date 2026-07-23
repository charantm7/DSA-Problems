# prime numbers

# which divides by itself or by 1

# num = int(input("Enter the number: "))


# is_prime = True

# if num <= 1:
#     is_prime = False


# else:
#     for i in range(2, int(num*0.5) + 1):

#         if (num % i == 0):
#             is_prime = False
#             break

# res = f"{num} is prime number" if is_prime else f"{num} is not prime number"
# print(res)


num = int(input("Enter the number: "))

is_prime = num > 1 and all(num % i != 0 for i in range(2, int(num*0.5) + 1))
print(f"{num} is {'Prime' if is_prime else "not prime"}")
