# EXPERIMENT NO. 5

## 1. Experiment Title
Arrays: Traversal and Counting

## 2. Aim
To create an array, visit every element with a loop, and add up or count the values.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **Array:** A fixed-size collection of values of the same data type, stored one after another and accessed by index.
- **Index:** The position of an element. The first element is at index 0 and the last is at `arr.length - 1`.
- **length:** `arr.length` gives the number of elements in the array.
- **Traversal:** Visiting every element of an array once, usually with a `for` loop.
- **Sum, largest and count:** These are found by keeping a variable and updating it while traversing the array.

## 5. Algorithm / Procedure

**Q1 - Print index and element**
1. Start.
2. Create `int[] arr = {3, 4, 5}`.
3. Repeat for `i = 0` to `arr.length - 1`.
4. Print `Index `, `i`, `: ` and `arr[i]`.
5. Stop.

**Q2 - Sum and largest**
1. Start.
2. Create `int[] arr = {12, 45, 7, 33, 21}`.
3. Set `sum = 0` and `largest = arr[0]`.
4. Repeat for every element: add it to `sum`, and if it is greater than `largest`, update `largest`.
5. Print `Sum: ` and `Largest: ` with their values.
6. Stop.

**Q3 - Count values greater than 10**
1. Start.
2. Create `int[] arr = {5, 12, 2, 14, 7}`.
3. Set `count = 0`.
4. Repeat for every element: if it is greater than 10, increase `count` by 1.
5. Print `Count greater than 10: ` followed by `count`.
6. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp5Q1.java](Q1/Exp5Q1.java) |
| Q2 | [Q2/Exp5Q2.java](Q2/Exp5Q2.java) |
| Q3 | [Q3/Exp5Q3.java](Q3/Exp5Q3.java) |

## 7. Input
- Q1: `arr = {3, 4, 5}`
- Q2: `arr = {12, 45, 7, 33, 21}`
- Q3: `arr = {5, 12, 2, 14, 7}`

## 8. Output

**Q1**
```
Index 0: 3
Index 1: 4
Index 2: 5
```
![Q1 Output](Q1/output.png)

**Q2**
```
Sum: 118
Largest: 45
```
![Q2 Output](Q2/output.png)

**Q3**
```
Count greater than 10: 2
```
![Q3 Output](Q3/output.png)

## 9. Result
All three programs were written and executed successfully in Visual Studio Code. Arrays were created and traversed with a loop to print elements with their index, find the sum and largest value, and count values greater than 10.

## 10. Viva-Voce Questions
1. What is an array and how is it declared in Java?
2. What is the index of the first and the last element of an array?
3. What does `arr.length` return?
4. What happens if we access `arr[arr.length]`?
5. Why is `largest` initialized with `arr[0]` in Q2?
