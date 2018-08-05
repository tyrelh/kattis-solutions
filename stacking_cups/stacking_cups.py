import sys

def is_number(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

vals = {}

lines = sys.stdin.readlines()

for i in range(1, int(lines[0].rstrip()) + 1):
    line = lines[i].rstrip()
    line = line.split(" ")
    if is_number(line[0]):
        vals[line[1]] = int(line[0])
    else:
        vals[line[0]] = int(line[1]) * 2


for key, value in sorted(vals.items(), key=lambda kv: kv[1]):
    print ("%s" % (key))
