import sys

params = sys.stdin.readline().rstrip().split(' ')

n = int(params[0])
days = int(params[1])

parts = []

for day in range(1, days + 1):
    part = sys.stdin.readline().rstrip()
    if part not in parts:
        parts.append(part)
    if len(parts) == n:
        print(str(day))
        break

if len(parts) < n:
    print('paradox avoided')