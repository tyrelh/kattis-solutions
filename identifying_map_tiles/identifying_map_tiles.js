const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on(('line'), (line) => {
  const nums = line.split('');
  const zoom = nums.length;
  let x = 0, y = 0;
  for (let digit of nums) {
    digit = parseInt(digit)
    x = x * 2;
    y = y * 2;
    if (digit === 1 || digit === 3) x++;
    if (digit === 2 || digit === 3) y++;
  }
  console.log(`${zoom} ${x} ${y}`);
});