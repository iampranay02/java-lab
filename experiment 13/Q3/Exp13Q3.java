// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 13 - Question 3
class Exp13Q3 {
public static void main(String[] args) {
String word = "racecar";
boolean palindrome = true;
for (int i = 0; i < word.length() / 2; i++) {
if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
palindrome = false;
break;
}
}
if (palindrome) {
System.out.println(word + " is a palindrome");
} else {
System.out.println(word + " is not a palindrome");
}
}
}
