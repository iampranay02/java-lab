// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 13 - Question 4
class Exp13Q4 {
public static void main(String[] args) {
String word = "abc";
for (int i = 0; i < word.length(); i++) {
for (int j = i + 1; j <= word.length(); j++) {
System.out.println(word.substring(i, j));
}
}
}
}
