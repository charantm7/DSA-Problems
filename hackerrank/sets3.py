# Enter your code here. Read input from STDIN. Print output to STDOUT

size = int(input())
n = set(map(int, input().split()))

cmsize = int(input())

for _ in range(cmsize):
    command = input().split()

    if command[0].lower() == "pop":
        if n:                       # safe pop
            n.pop()

    elif command[0].lower() == "remove":
        try:
            n.remove(int(command[1]))
        except KeyError:
            pass                    # ignore missing value

    else:   # discard
        n.discard(int(command[1]))

# print one element safely
if n:
    print(sum(n))
else:
    print(0)        # change this if problem expects something else
