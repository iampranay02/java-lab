# EXPERIMENT NO. 15

## 1. Experiment Title
StringBuilder Methods

## 2. Aim
To build and change text with `StringBuilder`, using `append`, `insert` and `deleteCharAt`.

## 3. Software / Tools Required
- Programming Language: Java (JDK 21)
- IDE: Visual Studio Code
- Version Control: Git and GitHub

## 4. Theory
- **StringBuilder:** A class for text that can be changed. Unlike a `String`, which is immutable, a `StringBuilder` changes the same object, so it is faster when text is modified many times.
- **append(x):** Adds `x` at the end of the text.
- **insert(index, x):** Adds `x` at the given position, moving the existing text to the right.
- **deleteCharAt(index):** Removes the character at the given position.
- **length():** Returns the number of characters in the text.
- **Printing:** `System.out.println(sb)` prints the text stored in the `StringBuilder`.

## 5. Algorithm / Procedure

**Q1 - append and length**
1. Start.
2. Create `StringBuilder sb` with the text `Hello`.
3. Append `" World"` to `sb`.
4. Print `sb`.
5. Print `Length: ` followed by `sb.length()`.
6. Stop.

**Q2 - append and deleteCharAt**
1. Start.
2. Create an empty `StringBuilder sb`.
3. Repeat for `i = 1` to `5`: append `i` and then append a comma.
4. Remove the last comma with `sb.deleteCharAt(sb.length() - 1)`.
5. Print `sb`.
6. Stop.

**Q3 - insert**
1. Start.
2. Create `StringBuilder sb` with the text `Java`.
3. Use `sb.insert(0, "Hello ")` to add `Hello ` at index 0.
4. Print `sb`.
5. Stop.

## 6. Program / Queries / Commands
The complete source code of each question is in its own folder:

| Question | Source file |
|----------|-------------|
| Q1 | [Q1/Exp15Q1.java](Q1/Exp15Q1.java) |
| Q2 | [Q2/Exp15Q2.java](Q2/Exp15Q2.java) |
| Q3 | [Q3/Exp15Q3.java](Q3/Exp15Q3.java) |

## 7. Input
- Q1: Starting text `Hello`, appended text ` World`
- Q2: Numbers 1 to 5, each followed by a comma
- Q3: Starting text `Java`, inserted text `Hello ` at index 0

## 8. Output

**Q1**
```
Hello World
Length: 11
```
![Q1 Output](Q1/output.png)

**Q2**
```
1,2,3,4,5
```
![Q2 Output](Q2/output.png)

**Q3**
```
Hello Java
```
![Q3 Output](Q3/output.png)

## 9. Result
All three programs were written and executed successfully in Visual Studio Code. A `StringBuilder` was used to append text, remove the last character and insert text at a given position.

## 10. Viva-Voce Questions
1. What is the difference between `String` and `StringBuilder`?
2. Why is `StringBuilder` faster than `String` for repeated changes?
3. What does `insert(0, "Hello ")` do?
4. How does `deleteCharAt()` work and why is `length() - 1` used in Q2?
5. Name two other methods of `StringBuilder`.
