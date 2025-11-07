# Enter your code here. Read input from STDIN. Print output to STDOUT

number_of_shoes = int(input())
number_of_size = list(map(int, input().split()))
number_of_customers = int(input())

item = []

while number_of_customers > 0:

    purchase = list(map(int, input().split()))
    item.append(purchase)
    number_of_customers -= 1

amount = 0

for i in item:

    if i[0] in number_of_size:

        number_of_size.remove(i[0])

        amount += i[1]

print(amount)
