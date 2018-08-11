import sys

n = int(sys.stdin.readline().rstrip())

for _ in range(n):
    line = sys.stdin.readline().rstrip()
    if '=' in line:
        print('skipped')
        continue
    line = line.split('+')
    result = int(line[0]) + int(line[1])
    print(str(result))