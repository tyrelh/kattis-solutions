import sys
cases = int(sys.stdin.readline().rstrip())

for i in range(cases):
    n = int(sys.stdin.readline().rstrip())

    line = sys.stdin.readline().rstrip().split(' ')
    for j in range(len(line)):
        line[j] = int(line[j])

    mini = 99
    maxi = 0
    mean = 0

    for j in line:
        if j > maxi:
            maxi = j
        if j < mini:
            mini = j
        mean += j

    mean = int(round(mean / n))
    dist = (mean - mini) * 2 + (maxi - mean) * 2

    print(str(dist))