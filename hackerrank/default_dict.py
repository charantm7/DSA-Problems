size = list(map(int, input().split()))
A = []
B = []
i = size[0]
j = size[1]

index = []
while i > 0:

    group_a = str(input())
    A.append(group_a)

    i -= 1


while j > 0:

    group_b = str(input())
    B.append(group_b)

    j -= 1

# a,b,a
# 0,1,2

# a,b
# 0,1
for chr1 in B:

    trace = []

    i = 1

    for chr2 in A:

        if chr1 == chr2:

            trace.append(i)

        i += 1
    if chr1 not in A:

        trace.append(-1)

    print(*trace)
