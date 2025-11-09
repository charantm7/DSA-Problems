def merge_the_tools(string, k):
    # your code goes here

    # slice the string as per the k value
    # if any letters are repeated remove that

    # need to store the seperated chunked string

    # ABC DAS GA
    # 012 345 67
    #  0 -> 10,
    # k = 3, i+k = 3, 3+3 = 6...
    for i in range(0, len(string), k):

        chunk = string[i:i+k]

        result = []
        for ch in chunk:

            if ch not in result:
                result.append(ch)

        print("".join(result))


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
