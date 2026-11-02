# EXPERIMENT NO. 13

## 1. Experiment Title
Strings: Methods and Palindromes

## 2. Aim
To use common `String` methods, reverse a word, check a palindrome and print substrings.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **String:** A sequence of characters. In Java a `String` is an object and cannot be changed after it is created (it is immutable).
- **Common methods:** `length()` gives the number of characters, `indexOf(ch)` gives the position of the first occurrence (counting from 0), `charAt(i)` gives the character at position `i`, `toUpperCase()` converts to capital letters and `substring(start, end)` gives the part from `start` up to, but not including, `end`.
- **Reversing:** A word is reversed by taking its characters from the last to the first with `charAt` and joining them with `+`.
- **Palindrome:** A word that reads the same from both ends, for example `racecar`.
- **Substrings:** All the parts of a word. For `abc` they are a, ab, abc, b, bc and c.

## 5. Algorithm / Procedure

**Q1 - String methods**
1. Start.
2. Store `Programming` in `word`.
3. Print `Length: ` followed by `word.length()`.
4. Print `Position of g: ` followed by `word.indexOf('g')`.
5. Print `Upper case: ` followed by `word.toUpperCase()`.
6. Stop.

**Q2 - Reverse a word**
1. Start.
2. Store `Java` in `word` and set `reversed = ""`.
3. Repeat for `i = word.length() - 1` down to `0`: `reversed = reversed + word.charAt(i)`.
4. Print `Reversed: ` followed by `reversed`.
5. Stop.

**Q3 - Palindrome check**
1. Start.
2. Store `racecar` in `word` and set `palindrome = true`.
3. Compare `word.charAt(i)` with `word.charAt(length - 1 - i)` for the first half of the word.
4. If any pair is different, set `palindrome = false` and stop checking.
5. If `palindrome` is true, print the word followed by `is a palindrome`, otherwise print the word followed by `is not a palindrome`.
6. Stop.

**Q4 - All substrings**
1. Start.
2. Store `abc` in `word`.
3. For each start position `i` from left to right, repeat for the end position `j = i + 1` to `word.length()`.
4. Print `word.substring(i, j)` on its own line.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp13Q1.java](Q1/Exp13Q1.java) |
| Q2 | [Q2/Exp13Q2.java](Q2/Exp13Q2.java) |
| Q3 | [Q3/Exp13Q3.java](Q3/Exp13Q3.java) |
| Q4 | [Q4/Exp13Q4.java](Q4/Exp13Q4.java) |

## 7. Input
- Q1: `word = "Programming"`
- Q2: `word = "Java"`
- Q3: `word = "racecar"`
- Q4: `word = "abc"`

## 8. Output

**Q1**
```
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```
![Q1 Output](Q1/output.png)

**Q2**
```
Reversed: avaJ
```
![Q2 Output](Q2/output.png)

**Q3**
```
racecar is a palindrome
```
![Q3 Output](Q3/output.png)

**Q4**
```
a
ab
abc
b
bc
c
```
![Q4 Output](Q4/output.png)

## 9. Result
All four programs were written and executed successfully in Visual Studio Code. `String` methods were used to find the length, position and upper case of a word, a word was reversed, a palindrome was checked and all substrings of a word were printed.

## 10. Viva-Voce Questions
1. What does it mean that a `String` is immutable?
2. What is the difference between `length()` and `indexOf()`?
3. What is a palindrome? Give two examples.
4. What are the two arguments of `substring(start, end)` and is `end` included?
5. Why is the reversed word built with `+` in a loop in Q2?
