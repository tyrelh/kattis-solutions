import sys

params = sys.stdin.readline().rstrip().split(' ')

y = int(params[1])

if y % 2 == 0:
    print('possible')
else:
    print('impossible')