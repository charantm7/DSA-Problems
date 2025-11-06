def main(size):

    import string
    alpha = string.ascii_lowercase

    # abcdefghijklmnopqrstuvwxyz
    # 0123456789
    # 5
    # e-d-c-b-a-b-c-d-e
    #   e-d-c-b-c-d-e

    print(alpha)
    lines = []
    for i in range(size):

        s = "-".join(alpha[size-1:i:-1]+alpha[i:size])
        lines.append(s.center(4*size-3))

    print("\n".join(lines[::-1] + lines[1::]))


main(5)
