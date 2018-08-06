import sys

line = sys.stdin.readline().rstrip()
lower = 0
upper = 0
white = 0
symbol = 0
total = 0

for char in line:
    val = ord(char)
    if val == 95:
        white += 1
    elif val in range(65, 91):
        upper += 1
    elif val in range(97, 123):
        lower += 1
    else:
        symbol += 1
    total += 1

white_p = white / total
lower_p = lower / total
upper_p = upper / total
symbol_p = symbol / total

print(str(white_p))
print(str(lower_p))
print(str(upper_p))
print(str(symbol_p))
