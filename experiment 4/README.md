# EXPERIMENT NO. 4

## 1. Experiment Title
Writing Functions

## 2. Aim
To write functions with parameters and return values, and call them from `main`.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **Function (method):** A named block of code that performs one task and can be called many times.
- **Parameters:** Values passed to a function when it is called, for example `fact(int n)`.
- **Return value:** The result a function sends back to the caller using `return`. The return type is written before the function name.
- **static:** A `static` function can be called from `main` without creating an object.
- **Combinations:** nCr = n! / (r! * (n - r)!)
- **Permutations:** nPr = n! / (n - r)!

## 5. Algorithm / Procedure

**Q1 - nCr**
1. Start.
2. Write `fact(n)`: set `f = 1`, repeat `i = 1` to `n` doing `f = f * i`, and return `f`.
3. Write `nCr(n, r)`: return `fact(n) / (fact(r) * fact(n - r))`.
4. In `main`, call `nCr(5, 2)`.
5. Print `5C2 = ` followed by the result.
6. Stop.

**Q2 - nPr**
1. Start.
2. Write `fact(n)`: set `f = 1`, repeat `i = 1` to `n` doing `f = f * i`, and return `f`.
3. Write `nPr(n, r)`: return `fact(n) / fact(n - r)`.
4. In `main`, call `nPr(5, 2)`.
5. Print `5P2 = ` followed by the result.
6. Stop.

**Q3 - Larger of two numbers**
1. Start.
2. Write `maxOf(a, b)`: if `a > b` return `a`, otherwise return `b`.
3. In `main`, call `maxOf(14, 9)`.
4. Print `Larger: ` followed by the result.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp4Q1.java](Q1/Exp4Q1.java) |
| Q2 | [Q2/Exp4Q2.java](Q2/Exp4Q2.java) |
| Q3 | [Q3/Exp4Q3.java](Q3/Exp4Q3.java) |

## 7. Input
- Q1: `n = 5`, `r = 2`
- Q2: `n = 5`, `r = 2`
- Q3: `a = 14`, `b = 9`

## 8. Output

**Q1**
```
5C2 = 10
```
![Q1 Output](Q1/output.png)

**Q2**
```
5P2 = 20
```
![Q2 Output](Q2/output.png)

**Q3**
```
Larger: 14
```
![Q3 Output](Q3/output.png)

## 9. Result
All three programs were written and executed successfully in Visual Studio Code. Functions with parameters and return values were created and called from `main` to find nCr, nPr and the larger of two numbers.

## 10. Viva-Voce Questions
1. What is a function and why do we use it?
2. What is the difference between a parameter and a return value?
3. Why is `static` used before the functions in this experiment?
4. What is the difference between nCr and nPr?
5. What happens if a function with a return type does not return a value?
