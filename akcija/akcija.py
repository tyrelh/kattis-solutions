import sys
from functools import reduce

n = int(sys.stdin.readline().rstrip())
vals = []
for x in range(n):
  vals.append(int(sys.stdin.readline().rstrip()))
vals.sort()
del vals[-3::-3]
print(reduce((lambda x, y: x+y), vals))