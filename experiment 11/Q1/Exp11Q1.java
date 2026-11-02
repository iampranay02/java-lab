// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 11 - Question 1
import java.util.Arrays;
class Exp11Q1 {
public static void main(String[] args) {
int[] arr = {5, 1, 4, 2, 8};
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
