import sys

n = int(sys.stdin.readline().rstrip())

for y in range(1, n + 1):
    input = sys.stdin.readline().rstrip().split(" ")
    m = int(input[1])

    pos = int((m * (m + 1)) / 2)
    even = m * (m + 1)
    odd = (m * (m + 1)) - m
    
    print(str(y) + " " + str(pos) + " " + str(odd) + " " + str(even))