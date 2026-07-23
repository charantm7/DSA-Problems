import re
size = int(input())
li = []

while size > 0:

    a = str(input())

    li.append(a)

    size -= 1


for i in li:

    try:

        re.compile(str(i))
        print(True)

    except re.error:
        print(False)
