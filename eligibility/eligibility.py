import sys
n = int(sys.stdin.readline().rstrip())

for line in sys.stdin.readlines():
  status = ""
  line = line.rstrip().split(" ")

  name = line[0]
  start = list(map(int, line[1].split("/")))
  birthday = list(map(int, line[2].split("/")))
  courses = int(line[3])

  if (start[0] >= 2010 or birthday[0] >= 1991):
    status = "eligible"
  elif (courses > 40):
    status = "ineligible"
  else:
    status = "coach petitions"
  
  print("{} {}".format(name, status))

