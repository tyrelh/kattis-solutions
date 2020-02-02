import sys

def factorial(x):
    if x == 1:
        return 1
    return (x * factorial(x - 1))

n = int(sys.stdin.readline().rstrip())
for i in range(n):
    t = int(sys.stdin.readline().rstrip())
    print(factorial(t) % 10)
