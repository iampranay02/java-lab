// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 8 - Question 2
class Exp8Q2 {
public static void main(String[] args) {
int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int[][] t = new int[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
t[j][i] = m[i][j];
}
}
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(t[i][j] + " ");
}
System.out.println();
}
}
}
