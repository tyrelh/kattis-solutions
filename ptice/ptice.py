import sys

adrian = ['A', 'B', 'C']
bruno = ['B', 'A', 'B', 'C']
goran = ['C', 'C', 'A', 'A', 'B', 'B']

n = int(sys.stdin.readline().rstrip())
q = sys.stdin.readline().rstrip()

scores = {'Adrian': 0, 'Bruno': 0, 'Goran': 0}

for i in range(n):
    if q[i] == adrian[i % 3]:
        scores['Adrian'] += 1
    if q[i] == bruno[i % 4]:
        scores['Bruno'] += 1
    if q[i] == goran[i % 6]:
        scores['Goran'] += 1

max = 0
for key in scores.keys():
    if scores[key] > max:
        max = scores[key]

print(str(max))
for key in scores.keys():
    if scores[key] == max:
        print(key)