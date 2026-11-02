// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 7 - Question 3
class Exp7Q3 {
public static void main(String[] args) {
int n = 1024;
int count = 0;
// Time complexity: O(log n)
while (n > 1) {
n = n / 2;
count++;
}
System.out.println("Halving steps: " + count);
}
}
