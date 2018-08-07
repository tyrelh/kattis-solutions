import sys, math

for line in sys.stdin.readlines():
    line = line.rstrip().split(' ')
    r = float(line[0])
    if r == 0:
        break
    m = int(line[1])
    c = int(line[2])

    actual = math.pi * (r ** 2)
    square_area = (r * 2) * (r * 2)
    ratio = c / m
    estimate = square_area * ratio

    result = str(actual) + ' ' + str(estimate)

    print(result)