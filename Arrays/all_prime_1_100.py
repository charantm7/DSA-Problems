
for i in range(1, 101):

    for a in range(2, int(i*0.5)+1):

        if i % a == 0:
            break
    else:

        print(i)
