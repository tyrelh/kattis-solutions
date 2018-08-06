import sys

cipher = sys.stdin.readline().rstrip()
per = "PER"
days = 0

for i in range(len(cipher)):
    if cipher[i] != per[i % 3]:
        days += 1

print(str(days))