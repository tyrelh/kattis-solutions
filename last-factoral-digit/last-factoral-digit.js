"use strict";
process.stdin.resume();
process.stdin.resume();
let inputString = "";
let currentLine = 0;
process.stdin.on("data", inputStdin => {
    inputString += inputStdin;
});
process.stdin.on("end", _ => {
    inputString = inputString.trim().split("\n").map(string => {
        return string.trim();
    });
    main();
});
function readLine() {
    return inputString[currentLine++];
}
function main() {
    const n = parseInt(readLine().trim());
    for (let i = 0; i < n; i++) {
        const t = parseInt(readLine().trim());
        console.log(factorial(t) % 10);
    }
}

function factorial(x) {
    if (x === 1) {
        return 1;
    }
    return (x * factorial(--x));
}