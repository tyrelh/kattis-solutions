import sys

params = sys.stdin.readline().rstrip().split(' ')

r = int(params[0])
c = int(params[1])
zr = int(params[2])
zc = int(params[3])

data = []
for line in sys.stdin.readlines():
    line = line.rstrip()
    data.append(line)

data_c = []
for line in data:
    for i in range(zr):
        data_c.append(line)

data_rc = []
for line in data_c:
    new_line = ''
    for char in line:
        for i in range(zc):
            new_line += char
    data_rc.append(new_line)

for line in data_rc:
    print(line)