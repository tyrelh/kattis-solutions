import sys

n = int(sys.stdin.readline().rstrip())

for _ in range(n):
    line = sys.stdin.readline().rstrip()
    if 'Simon says' in line:
        line = line.split(' ')
        line.pop(0)
        line.pop(0)
        line = ' '.join(line)
        print(line)