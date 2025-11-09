import decimal


def average(array):

    arr = set(array)
    r = sum(arr)/len(arr)
    return f"{r:.3f}"


if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
