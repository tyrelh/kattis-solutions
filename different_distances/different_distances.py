import sys

line = list(map(float, sys.stdin.readline().rstrip().split(" ")))

while len(line) != 1 and line[0] != 0:
  x1 = line[0]
  y1 = line[1]
  x2 = line[2]
  y2 = line[3]
  p = line[4]
  
  val = ((abs(x1 - x2)**p) + (abs(y1 - y2)**p))**(1/p)
  print("%.10f" % val)

  line = list(map(float, sys.stdin.readline().rstrip().split(" ")))

