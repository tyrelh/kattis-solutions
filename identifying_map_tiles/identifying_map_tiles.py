import sys

nums = list(map(int, list(sys.stdin.readline().rstrip())))
zoom = len(nums)
x, y = 0, 0
for digit in nums:
  x = x * 2
  y = y * 2
  if digit == 1 or digit == 3:
    x += 1
  if digit == 2 or digit == 3:
    y += 1
print("{} {} {}".format(zoom, x, y))