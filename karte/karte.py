import sys


def countCards(input):
    cards = {}
    cards["P"] = [False]*13
    cards["K"] = [False]*13
    cards["H"] = [False]*13
    cards["T"] = [False]*13

    for i in range(0, len(input), 3):
        suit = input[i:i+1]
        num = int(input[i+1:i+3])
        if cards[suit][num-1]:
            return "GRESKA"
        else:
            cards[suit][num-1] = True

    result = ""
    for suit in cards:
        count = 13
        for i in range(13):
            if cards[suit][i]:
                count -= 1
        result += str(count) + " "
    result = result[:-1]

    return result


input = sys.stdin.readline().rstrip()
print(countCards(input))