// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 12 - Question 1
import java.util.Arrays;
class Exp12Q1 {
public static void main(String[] args) {
int[] arr = {7, 3, 5, 1};
for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
System.out.println("Sorted: " + Arrays.toString(arr));
}
}
