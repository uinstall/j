import java.util.Scanner;
import area.*;
public class Rectangle {
 public static void main(String[] args) {
 int l,b;
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter Length: ");l = sc.nextInt();
 System.out.println(" Enter Breadth: ");b = sc.nextInt();
 MyArea a = new MyArea();
 a.displayArea(l,b);
 } }