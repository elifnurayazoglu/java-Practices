# Caesar Cipher

A console program that encrypts a single lowercase letter by shifting it a given number of positions in the alphabet. After `z` it wraps around to `a`.

## How it works

1. Reads a lowercase letter and a shift amount.
2. Converts the letter to its position in the alphabet (`a` = 0 ... `z` = 25).
3. Adds the shift and wraps around with `% 26`.
4. Converts the new position back to a letter.

```java
char encrypted = (char) ('a' + (ch - 'a' + k) % 26);
```

## Example

```
Please enter a lowercase letter: z
Please enter the shift amount: 3
Encrypted letter: c
```

## Concepts practiced

- `char` arithmetic and Unicode values
- Casting between `int` and `char`
- Input validation with `if / else`
- The `%` (remainder) operator

## Run

```
Open the project in NetBeans and run the main class.
```
