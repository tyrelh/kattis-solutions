const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let linecount = 0;
let n = 0;
let mins = 0;
let secs = 0;
rl.on(('line'), (line) => {
  linecount++;
  if (linecount === 1) n = parseInt(line);
  else {
    line = line.split(" ");
    mins += parseInt(line[0]);
    secs += parseInt(line[1]);
  }
  if (linecount === n + 1) {
    let result = secs / 60 / mins;
    console.log((result > 1) ? result : "measurement error")
  }
});