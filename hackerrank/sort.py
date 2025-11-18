
string = input()

lower = []
upper = []
even = []
odd = []

for i in string:
    if i.isdigit():
        if int(i) % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    elif i.isalpha():
        if i.isupper():
            upper.append(i)
        else:
            lower.append(i)

lower.sort()
upper.sort()
even.sort()
odd.sort


print("".join(lower)+"".join(upper) +
      "".join(map(str, odd))+"".join(map(str, even)))
