# Enter your code here. Read input from STDIN. Print output to STDOUT

single_english = int(input())
list_english = set(input().split())


single_french = int(input())
list_french = set(input().split())


a = list_english.symmetric_difference(list_french)
print(len(a))
