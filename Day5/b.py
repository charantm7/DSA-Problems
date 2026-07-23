a = [1, 5, 3, 6, 8, 7]


for i in range(len(a)-1):

    for j in range(len(a)-i-1):

        if (a[j] > a[j+1]):
            temp = a[j]
            a[j] = a[j+1]
            a[j+1] = temp

print(a)
