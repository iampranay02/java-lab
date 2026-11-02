# EXPERIMENT NO. 8

## 1. Experiment Title
Matrices: Transpose and Row Sums

## 2. Aim
To create two-dimensional arrays, visit them row by row, and build a new matrix from one.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **Two-dimensional array:** An array of arrays used to store a matrix. `new int[3][4]` creates 3 rows and 4 columns, and `m[i][j]` is the element in row `i` and column `j`.
- **Row-by-row traversal:** The outer loop moves over the rows and the inner loop moves over the columns of each row.
- **Transpose:** A new matrix in which rows and columns are swapped, so `t[j][i] = m[i][j]`.
- **Row sum:** The total of all the elements in one row, found by adding `m[i][j]` for every column `j`.

## 5. Algorithm / Procedure

**Q1 - Fill and print a 3 x 4 matrix**
1. Start.
2. Create `int[][] m = new int[3][4]` and set `value = 1`.
3. Using nested loops, store `value` in `m[i][j]` and increase `value` by 1.
4. Using nested loops, print every element followed by a space, and move to the next line after each row.
5. Stop.

**Q2 - Transpose**
1. Start.
2. Create the 3 x 3 matrix `m` with rows 1 2 3, 4 5 6 and 7 8 9, and an empty matrix `t`.
3. Using nested loops, set `t[j][i] = m[i][j]`.
4. Print `t` one row per line, with a space after each number.
5. Stop.

**Q3 - Row sums**
1. Start.
2. Create the 3 x 3 matrix `m` with rows 1 2 3, 4 5 6 and 7 8 9.
3. For each row `i`, set `sum = 0` and add every `m[i][j]` to it.
4. Print `Row ` followed by the row number, ` sum: ` and `sum`.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp8Q1.java](Q1/Exp8Q1.java) |
| Q2 | [Q2/Exp8Q2.java](Q2/Exp8Q2.java) |
| Q3 | [Q3/Exp8Q3.java](Q3/Exp8Q3.java) |

## 7. Input
- Q1: Matrix of 3 rows and 4 columns filled with the values 1 to 12
- Q2: Matrix with rows `1 2 3`, `4 5 6` and `7 8 9`
- Q3: Matrix with rows `1 2 3`, `4 5 6` and `7 8 9`

## 8. Output

**Q1**
```
1 2 3 4 
5 6 7 8 
9 10 11 12 
```
![Q1 Output](Q1/output.png)

**Q2**
```
1 4 7 
2 5 8 
3 6 9 
```
![Q2 Output](Q2/output.png)

**Q3**
```
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```
![Q3 Output](Q3/output.png)

## 9. Result
All three programs were written and executed successfully in Visual Studio Code. A matrix was filled and printed, its transpose was created, and the sum of each row was calculated using two-dimensional arrays and nested loops.

## 10. Viva-Voce Questions
1. What is a two-dimensional array?
2. How do you declare a matrix with 3 rows and 4 columns in Java?
3. What is the transpose of a matrix?
4. Which loop controls the rows and which controls the columns?
5. What is the time complexity of visiting all elements of an `n x n` matrix?
