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
    const h = 4;
    const values = readLine().split(" ");
    const w = parseInt(values[0]);
    const horizontalCut = parseInt(values[1]);
    const verticalCut = parseInt(values[2]);

    const qValues = [];
    qValues.push(horizontalCut * verticalCut * h);
    qValues.push((w - horizontalCut) * verticalCut * h);
    qValues.push((w - horizontalCut) * (w - verticalCut) * h);
    qValues.push(horizontalCut * (w - verticalCut) * h);

    console.log(Math.max(...qValues));
}