size = int(input())

li = []

while size > 0:

    a = input().split()

    li.append(a)

    size -= 1


for i in li:

    try:

        print(int(i[0])//int(i[1]))

    except ZeroDivisionError as err:
        print(f"Error Code: {err}")

    except ValueError as vrr:
        print(f"Error Code: {vrr}")
