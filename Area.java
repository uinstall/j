public interface Shape {
 void getArea(int l, int b);
 
}
class Rectangle implements Shape {
 @Override
 public void getArea(int l, int b) { 
 System.out.println(" Area of Rectangle is: "+(l*b)+" Sq.Units");
 } }
class Square implements Shape{
 
 @Override
 public void getArea(int l, int b) {
 System.out.println(" Area of Square is: "+(l*b)+" Sq.Units");
 } }
public class Area {
 public static void main(String[] args) {
 Rectangle r = new Rectangle();
 Square s = new Square();
 
 r.getArea(30, 20);
 s.getArea(30, 20);
 } 
} 