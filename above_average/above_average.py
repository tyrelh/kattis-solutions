import sys

cases = int(sys.stdin.readline().rstrip())

for _ in range(cases):

    data = sys.stdin.readline().rstrip().split(' ')

    n = int(data[0])

    grades = []

    for grade in data[1:]:
        grades.append(int(grade))

    average = sum(grades) / n

    above = 0
    for grade in grades:
        if grade > average:
            above += 1
    percent = (above / n) * 100

    print("%.3f" % percent + '%')