const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let lineCount = 0;
let n = 0;
let qaly = 0.0;

rl.on(('line'), (line) => {
  lineCount++;
  if (lineCount === 1) {
    n = parseInt(line) - 1;
  }
  else {
    line = line.split(" ");
    qaly += parseFloat(line[0]) * parseFloat(line[1]);
  }

  if (lineCount === n) {
    console.log(qaly);
  }
});
