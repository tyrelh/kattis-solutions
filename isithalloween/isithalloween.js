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
    const values = readLine().split(" ");
    const month = values[0];
    const day = parseInt(values[1]);
    if (validate(month, day)) {
        console.log("yup");
    } else {
        console.log("nope")
    }
}

function validate(month, day) {
    const halloween = (month === "OCT" && day === 31);
    const christmas = (month === "DEC" && day === 25);
    return (halloween || christmas)
}
