// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 11 - Question 2
import java.util.Arrays;
class Exp11Q2 {
public static void main(String[] args) {
int[] arr = {64, 25, 12, 22, 11};
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int min = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[min]) {
min = j;
}
}
int temp = arr[min];
arr[min] = arr[i];
arr[i] = temp;
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
