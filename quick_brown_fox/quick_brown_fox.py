import sys

UNICODE_OFFSET = 97

n = int(sys.stdin.readline().rstrip())

for _ in range(n):
    letters = [0] * 26
    line = sys.stdin.readline().rstrip()
    line = line.lower()
    for char in line:
        if ord(char) in range(UNICODE_OFFSET, UNICODE_OFFSET + 26):
            letters[ord(char) - UNICODE_OFFSET] += 1

    missing = 'missing '
    for i in range(26):
        if letters[i] == 0:
            missing += chr(i + UNICODE_OFFSET)

    if missing == 'missing ':
        print('pangram')
    else:
        print(missing)