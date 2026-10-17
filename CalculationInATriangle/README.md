# Triangle Calculator

A console program that takes the coordinates of a triangle's three corners and calculates its side lengths, angles and area.

## How it works

1. Reads `x` and `y` for each of the three points.
2. Finds the side lengths with the distance formula.
3. Finds the angles with the law of cosines and converts them to degrees.
4. Finds the area with Heron's formula.
5. Prints the sum of the angles as a check (it should be 180).

## Example

Input points: `(0, 0)`, `(4, 0)`, `(0, 3)`

```
Angle 1: 90.00
Angle 2: 36.87
Angle 3: 53.13

Sum of the angles: 180.0
Area of the triangle: 6.0
```

## Concepts practiced

- `Scanner` input
- `Math.sqrt`, `Math.pow`, `Math.acos`, `Math.toDegrees`
- `printf` formatting

## Run

```
javac CalculationInATriangle.java
java CalculationInATriangle
```
