
# for i in range(1, 101):

#     for a in range(2, int(i*0.5)+1):

#         if i % a == 0:
#             break
#     else:

#         print(i)


i = 2
while i <= 100:

    num = 2
    is_prime = True

    while num <= i // 2:

        if (i % num == 0):
            is_prime = False
            break

        num += 1

    if is_prime:
        print(i)

    i += 1
