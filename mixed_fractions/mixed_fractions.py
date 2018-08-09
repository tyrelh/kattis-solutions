import sys

for line in sys.stdin.readlines():
    line = line.rstrip().split(' ')
    numerator = int(line[0])
    denominator = int(line[1])
    if numerator == 0 and denominator == 0:
        break
    print(str(int(numerator / denominator)) + ' ' + str(numerator % denominator) + ' / ' + str(denominator))