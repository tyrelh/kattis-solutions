import sys
num_lines = int(sys.stdin.readline().rstrip())

val1 = ''
val2 = ''
diff = ''

for _ in range(num_lines):
    val1 = sys.stdin.readline().rstrip()
    val2 = sys.stdin.readline().rstrip()
    diff = ''
    for i in range(len(val1)):
        if val1[i] == val2[i]:
            diff += '.'
        else:
            diff += '*'
    print(val1)
    print(val2)
    print(diff)
    print()
