import sys

n = int(sys.stdin.readline().rstrip())
mins = 0
secs = 0
for x in range(n):
  line = sys.stdin.readline().rstrip().split(" ")
  m, s = int(line[0]), int(line[1])
  mins += m
  secs += s
result = secs / 60 / mins
if result <= 1:
  print("measurement error")
else:
  print(result)