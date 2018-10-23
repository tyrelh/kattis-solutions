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

  const n = parseInt(readLine());
  let books = [];
  for (let i = 0; i < n; i++) {
    books.push(parseInt(readLine()));
  }
  books.sort((x, y) => {return x - y}).reverse();
  let books_paid_for = [];
  for (let i = 0; i < n; i++) {
    if ((i + 1) % 3 != 0) {
      books_paid_for.push(books[i]);
    }
  }
  console.log(books_paid_for.reduce((x, y) => {return x + y}));

}