from collections import namedtuple
size, fields = int(input()), input().split()
Student = namedtuple('Student', fields)
students = [Student(*input().split()) for _ in range(size)]
print(sum(int(s.MARKS) for s in students)/size)
# 