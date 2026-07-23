def minion_game(string):
    # your code goes here

    # stuart -> constant
    # kevin -> vowels
    string = string.lower()
    constants = "bcdfghjklmnpqrstvwxyz"
    vowels = "aeiou"

    kevin = 0
    stuart = 0

    pairs = [string[i:i+2] for i in range(len(string)-1)]

    print(pairs)


if __name__ == '__main__':
    s = input()
    minion_game(s)
