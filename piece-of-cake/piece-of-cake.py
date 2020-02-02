import sys

input = sys.stdin.readline().rstrip().split(' ')
h = 4
w = int(input[0])
horizontalCut = int(input[1])
verticalCut = int(input[2])

qValues = []
qValues.append(horizontalCut * verticalCut * h)
qValues.append((w - horizontalCut) * verticalCut * h)
qValues.append((w - horizontalCut) * (w - verticalCut) * h)
qValues.append(horizontalCut * (w - verticalCut) * h)

print(max(qValues))