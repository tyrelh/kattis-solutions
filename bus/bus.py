import sys

n = int(sys.stdin.readline().rstrip())

for _ in range(n):
    stops = int(sys.stdin.readline().rstrip())
    people = 0
    for stop in range(stops):
        people = people + 0.5
        people = people * 2
    if stops == 0:
        print("0")
    else:
        print(str(int(people)))