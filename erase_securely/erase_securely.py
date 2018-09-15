import sys

n = int(sys.stdin.readline().rstrip())

before = sys.stdin.readline().rstrip()
after = sys.stdin.readline().rstrip()

if n % 2 == 0:
    if before == after:
        print("Deletion succeeded")
    else:
        print("Deletion failed")
else:
    new = ""
    for bit in before:
        if bit == "0":
            new = new + "1"
        else:
            new = new + "0"
    if new == after:
        print("Deletion succeeded")
    else:
        print("Deletion failed")