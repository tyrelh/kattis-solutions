import sys
morse = {
  "A": ".-",
  "B": "-...",
  "C": "-.-.",
  "D": "-..",
  "E": ".",
  "F": "..-.",
  "G": "--.",
  "H": "....",
  "I": "..",
  "J": ".---",
  "K": "-.-",
  "L": ".-..",
  "M": "--",
  "N": "-.",
  "O": "---",
  "P": ".--.",
  "Q": "--.-",
  "R": ".-.",
  "S": "...",
  "T": "-",
  "U": "..-",
  "V": "...-",
  "W": ".--",
  "X": "-..-",
  "Y": "-.--",
  "Z": "--..",
  "_": "..--",
  ".": "---.",
  ",": ".-.-",
  "?": "----",
}

# build reverse mapping
letters = {}
for char in morse:
  letters[morse[char]] = char

line = sys.stdin.readline().rstrip()
while line:
  sizes = []
  morse_string = ""
  for char in line:
    morse_string += morse[char]
    sizes.append(len(morse[char]))
  sizes.reverse()
  off = 0
  result = ""
  for x in sizes:
    char = morse_string[off:off+x]
    result += letters[char]
    off += x
  print(result)
  line = sys.stdin.readline().rstrip()