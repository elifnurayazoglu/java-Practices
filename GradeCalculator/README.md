# Grade Calculator

A simple Java console program that calculates a student's weighted average and letter grade.

## Features

- Accepts a full name with two or three name parts
- Displays the initials in uppercase
- Reads quiz, midterm, and final exam grades
- Checks that each grade is between 0 and 100
- Calculates the weighted average
- Assigns a letter grade and prints a short message
- Formats the results as a table

## Grade weights

| Assessment | Weight |
| --- | ---: |
| Quiz | 20% |
| Midterm | 30% |
| Final | 50% |

The letter grade is assigned using these thresholds:

| Average | Grade |
| ---: |:---:|
| 90 and above | AA |
| 80–89.99 | BB |
| 70–79.99 | CC |
| 60–69.99 | DD |
| Below 60 | FF |

## Requirements

- Java Development Kit (JDK)
- Any Java IDE, such as NetBeans, or a terminal that can compile and run Java programs

## Run the program

The source file uses the package `com.mycompany.gradecalculator`. In NetBeans, open the project and run `GradeCalculator`.

To compile and run from a terminal, use the project’s source folder and preserve the package directory structure:

```bash
javac com/mycompany/gradecalculator/GradeCalculator.java
java com.mycompany.gradecalculator.GradeCalculator
```

## Example

```text
Please enter your full name (at least two names, at most three names):
Ada Lovelace
Please enter your quiz grade:
85
Please enter your midterm grade:
90
Please enter your final grade:
95

Name                    Quiz     Midterm       Final
A. L.                   85.00       90.00       95.00
Average                                         91.75
Letter Grade:                                    AA
Very well, keep it up :)
```

## Concepts practiced

This project is a beginner Java exercise using `Scanner`, variables, arithmetic expressions, `if/else if/else`, `String` methods (`trim`, `indexOf`, `lastIndexOf`, `substring`), `charAt`, `Character.toUpperCase`, `String.equals`, and formatted output with `printf`.

## Notes

- Enter the name using single spaces between parts.
- The program accepts two or three name parts.
- Grades must be from 0 to 100, inclusive.

## Author

Created as a Java practice project.
