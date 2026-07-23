k = 3
num = [1, 2, 3, 4, 5, 6, 7]
k %= len(num)
print(num[-k:] + num[:-k])
    