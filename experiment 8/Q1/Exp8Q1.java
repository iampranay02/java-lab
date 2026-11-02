// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 8 - Question 1
class Exp8Q1 {
public static void main(String[] args) {
int[][] m = new int[3][4];
int value = 1;
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 4; j++) {
m[i][j] = value;
value++;
}
}
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 4; j++) {
System.out.print(m[i][j] + " ");
}
System.out.println();
}
}
}
