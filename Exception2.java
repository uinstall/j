import java.util.Scanner;
class MyException extends Exception{
 MyException(String s){
 super(s);
 } }
public class Exception2 {
 public static void main(String[] args) throws MyException {
 int m;
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter Marks: ");m = sc.nextInt();
 try {
 if (m<40) {
 throw new MyException("Student Fail");
 }
 
 } catch (Exception e) {
 System.out.println(e.getMessage());
 }
 sc.close();
 } 
}