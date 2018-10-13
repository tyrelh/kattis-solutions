import sys


(r, c) = tuple(map(int, sys.stdin.readline().rstrip().split(" ")))
lines = sys.stdin.readlines()
data = []
results = {0: 0, 1: 0, 2: 0, 3: 0, 4: 0}

def scan(i, j):
  count = 0
  building = False
  for x in range(i, i+2):
    for y in range(j, j+2):
      if data[x][y] == '#':
        building = True
      elif data[x][y] == 'X':
        count += 1
  return count if not building else -1


for line in lines:
  line = list(line.rstrip())
  data.append(line)

for i in range(0, r-1):
  for j in range(0, c-1):
    val = scan(i, j)
    if val >= 0:
      results[val] += 1

for result in results:
  print(results[result])