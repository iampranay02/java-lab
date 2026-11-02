// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 15 - Question 2
class Exp15Q2 {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder();
for (int i = 1; i <= 5; i++) {
sb.append(i);
sb.append(",");
}
sb.deleteCharAt(sb.length() - 1);
System.out.println(sb);
}
}
