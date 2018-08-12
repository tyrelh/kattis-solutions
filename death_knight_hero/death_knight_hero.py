import sys

n = int(sys.stdin.readline().rstrip())
losses = 0

for _ in range(n):
    game = sys.stdin.readline().rstrip()
    for i in range(1, len(game)):
        if game[i] == 'D':
            if game[i - 1] == 'C':
                losses += 1
print(str(n - losses))