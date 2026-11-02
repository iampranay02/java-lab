// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 6 - Question 3
class Exp6Q3 {
public static void main(String[] args) {
int[] arr = {4, 9, 2, 9, 7};
boolean found = false;
int repeated = 0;
for (int i = 0; i < arr.length && !found; i++) {
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] == arr[j]) {
found = true;
repeated = arr[i];
break;
}
}
}
if (found) {
System.out.println("Repeated value: " + repeated);
} else {
System.out.println("No repeated value");
}
}
}
