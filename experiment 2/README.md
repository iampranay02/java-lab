# EXPERIMENT NO. 2

## 1. Experiment Title
Decisions and Loops with Numbers

## 2. Aim
To use `if`, `else if` and loops to make decisions and repeat steps with whole numbers.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **if-else:** Runs one block of code if a condition is true, otherwise another block.
- **else-if ladder:** Checks several conditions one after another and runs the first block whose condition is true.
- **Operators:** `%` gives the remainder, `&&` is logical AND, `||` is logical OR.
- **for loop:** Repeats a block of code a fixed number of times using an initialization, a condition and an update.
- **Leap year:** A year divisible by 4 but not by 100, or divisible by 400.

## 5. Algorithm / Procedure

**Q1 - Even or Odd**
1. Start.
2. Store 27 in `n`.
3. If `n % 2 == 0`, print `n is even`.
4. Otherwise, print `n is odd`.
5. Stop.

**Q2 - Grade**
1. Start.
2. Store 83 in `marks`.
3. If `marks >= 90`, print `Grade: A`.
4. Else if `marks >= 75`, print `Grade: B`.
5. Otherwise, print `Grade: C`.
6. Stop.

**Q3 - Leap Year**
1. Start.
2. Store 2024 in `year`.
3. If `(year % 4 == 0 && year % 100 != 0) || year % 400 == 0`, print `Leap year`.
4. Otherwise, print `Not a leap year`.
5. Stop.

**Q4 - Factorial**
1. Start.
2. Set `factorial = 1`.
3. Repeat for `i = 1` to `5`: `factorial = factorial * i`.
4. Print `Factorial of 5 is ` followed by `factorial`.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp2Q1.java](Q1/Exp2Q1.java) |
| Q2 | [Q2/Exp2Q2.java](Q2/Exp2Q2.java) |
| Q3 | [Q3/Exp2Q3.java](Q3/Exp2Q3.java) |
| Q4 | [Q4/Exp2Q4.java](Q4/Exp2Q4.java) |

## 7. Input
- Question 1: `n = 27`
- Question 2: `marks = 83`
- Question 3: `year = 2024`
- Question 4: Number = 5

## 8. Output

**Q1**
```
27 is odd
```
![Q1 Output](Q1/output.png)

**Q2**
```
Grade: B
```
![Q2 Output](Q2/output.png)

**Q3**
```
Leap year
```
![Q3 Output](Q3/output.png)

**Q4**
```
Factorial of 5 is 120
```
![Q4 Output](Q4/output.png)

## 9. Result
All four programs were written and executed successfully in Visual Studio Code. Decisions were made with `if-else` and an else-if ladder, and a `for` loop was used to calculate a factorial.

## 10. Viva-Voce Questions
1. What is the difference between `if-else` and an else-if ladder?
2. What does the `%` operator return?
3. Which years are leap years? Is 1900 a leap year?
4. What are the three parts of a `for` loop?
5. What is the factorial of 0?
