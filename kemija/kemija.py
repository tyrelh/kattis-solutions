import sys
import string

vowels = ['a', 'e', 'i', 'o', 'u']

line = sys.stdin.readline().rstrip()
line = list(line)

for x in range(len(line)):
    if line[x] in vowels:
        line[x + 1] = '#'
        line[x + 2] = '#'

newline = ''
for char in line:
    if char != '#':
        newline += char
print(newline)