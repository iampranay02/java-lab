// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 4 - Question 2
class Exp4Q2 {
static int fact(int n) {
int f = 1;
for (int i = 1; i <= n; i++) {
f = f * i;
}
return f;
}
static int nPr(int n, int r) {
return fact(n) / fact(n - r);
}
public static void main(String[] args) {
System.out.println("5P2 = " + nPr(5, 2));
}
}
