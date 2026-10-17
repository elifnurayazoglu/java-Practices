# Character Analysis

A console program that reads one character and tells you what kind it is: uppercase letter, lowercase letter, digit or symbol. For letters, it also says whether the letter is a vowel or a consonant.

## How it works

1. Reads a line and checks that it contains exactly one character.
2. Uses `Character.isLetter`, `isDigit` and `toLowerCase` to find the type.
3. Checks vowels with `"aeiou".indexOf(lower) != -1`.

## Example

```
Please enter a character: E
You entered an uppercase letter.
The letter is a vowel.
```

```
Please enter a character: 7
The character is a digit.
```

## Concepts practiced

- `Character` class methods
- `String` methods: `charAt`, `length`, `indexOf`
- Nested `if / else if / else`

## Run

```
Open the project in NetBeans and run the main class.
```
