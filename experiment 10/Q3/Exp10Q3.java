// Name: Pranay Kesarwani | Roll No: 2510303375 | Assignment 10 - Question 3
import java.util.ArrayList;
class Exp10Q3 {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.set(1, 25);
list.remove(3);
System.out.println(list);
System.out.println("Size: " + list.size());
}
}
