import sys

line = list(map(int, sys.stdin.readline().rstrip().split(" ")))
a, i = line[0], line[1]
print(str((i * a) - a + 1))