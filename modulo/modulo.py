import sys

lines = sys.stdin.readlines()
vals = []

for line in lines:
    val = int(line.rstrip())
    val = val % 42
    if val not in vals:
        vals.append(val)

print(str(len(vals)))