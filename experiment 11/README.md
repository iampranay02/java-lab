# EXPERIMENT NO. 11

## 1. Experiment Title
Bubble Sort and Selection Sort

## 2. Aim
To sort small arrays with bubble sort and selection sort, and count the swaps.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **Sorting:** Arranging the elements of an array in increasing (or decreasing) order.
- **Bubble sort:** Repeatedly compares two neighbouring elements and swaps them if they are in the wrong order. After each pass the largest remaining value moves to the end.
- **Selection sort:** In each pass, finds the smallest value in the unsorted part and swaps it into its correct position.
- **Swap:** Exchanging two values using a temporary variable.
- **Time complexity:** Both bubble sort and selection sort take O(n^2) time.
- **Arrays.toString():** Prints an array in square brackets with values separated by commas.

## 5. Algorithm / Procedure

**Q1 - Bubble sort**
1. Start.
2. Create `int[] arr = {5, 1, 4, 2, 8}`.
3. Repeat the outer loop for `i = 0` to `n - 2`, and the inner loop for `j = 0` to `n - i - 2`.
4. If `arr[j] > arr[j + 1]`, swap the two values.
5. Print `Sorted: ` followed by the array.
6. Stop.

**Q2 - Selection sort**
1. Start.
2. Create `int[] arr = {64, 25, 12, 22, 11}`.
3. For each position `i`, set `min = i` and search `j = i + 1` to `n - 1` for a smaller value, updating `min`.
4. Swap `arr[min]` with `arr[i]`.
5. Print `Sorted: ` followed by the array.
6. Stop.

**Q3 - Count the swaps in bubble sort**
1. Start.
2. Create `int[] arr = {5, 1, 4, 2, 8}` and set `swaps = 0`.
3. Run bubble sort, and increase `swaps` by 1 every time two values are swapped.
4. Print `Swaps: ` followed by `swaps`.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp11Q1.java](Q1/Exp11Q1.java) |
| Q2 | [Q2/Exp11Q2.java](Q2/Exp11Q2.java) |
| Q3 | [Q3/Exp11Q3.java](Q3/Exp11Q3.java) |

## 7. Input
- Q1: `arr = {5, 1, 4, 2, 8}`
- Q2: `arr = {64, 25, 12, 22, 11}`
- Q3: `arr = {5, 1, 4, 2, 8}`

## 8. Output

**Q1**
```
Sorted: [1, 2, 4, 5, 8]
```
![Q1 Output](Q1/output.png)

**Q2**
```
Sorted: [11, 12, 22, 25, 64]
```
![Q2 Output](Q2/output.png)

**Q3**
```
Swaps: 4
```
![Q3 Output](Q3/output.png)

## 9. Result
All three programs were written and executed successfully in Visual Studio Code. Arrays were sorted using bubble sort and selection sort, and the number of swaps made by bubble sort was counted.

## 10. Viva-Voce Questions
1. How does bubble sort work?
2. How does selection sort work?
3. What is the time complexity of bubble sort and selection sort?
4. Why is a temporary variable needed to swap two values?
5. Why are there 4 swaps for the array `{5, 1, 4, 2, 8}` in Q3?
