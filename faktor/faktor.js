'use strict';
process.stdin.resume();
process.stdin.setEncoding('utf-8');
let inputString = '';
let currentLine = 0;
process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});
process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    main();    
});
function readLine() {
    return inputString[currentLine++];
}


function main() {
  let line = readLine().trim().split(" ");
  const a = parseInt(line[0]);
  const i = parseInt(line[1]);
  console.log((a * i) - a + 1);
} 
