import sys

def validate(month, day):
    halloween = (month == "OCT" and day == 31)
    christmas = (month == "DEC" and day == 25)
    return (halloween or christmas)

input = sys.stdin.readline().rstrip().split(' ')
month = input[0]
day = int(input[1])

if (validate(month, day)):
    print("yup")
else:
    print("nope")