import sys

params = sys.stdin.readline().rstrip().split(' ')

maximum = int(params[0])
num_events = int(params[1])
current = 0
blocked = 0

for _ in range(num_events):
    event = sys.stdin.readline().rstrip().split(' ')
    val = int(event[1])
    if event[0] == 'enter':
        if current + val <= maximum:
            current += val
        else:
            blocked += 1
    elif event[0] == 'leave':
        current -= val

print(str(blocked))
