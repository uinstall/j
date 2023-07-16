import java.util.Scanner;

//Parent Class
public class Assign_Inheritance 
{
int id;
String Name;
String Add;
int Mobile;

}

//For single level
class child extends Assign_Inheritance
{
void input()
{
System.out.println("Enter the Employee Id :");
Scanner sc=new Scanner(System.in);
id=sc.nextInt();
System.out.println("Enter the Employee Name :");
Scanner sc1=new Scanner(System.in);
Name=sc1.next();
System.out.println("Enter the Employee Address (City) :");
Scanner sc2=new Scanner(System.in);
Add=sc2.next();
System.out.println("Enter the Employee Mobile :");
Scanner sc3=new Scanner(System.in);
Mobile=sc3.nextInt();


}
void display()
{
System.out.println("\nEmployee Detail is :\n");
System.out.println("Employee ID :"+id);
System.out.println("Employee Name :"+Name);
System.out.println("Employee Address :"+Add);
System.out.println("Employee Mobile Number :"+Mobile+"\n");
    
}

}
class child2 extends Assign_Inheritance
{
void input()
{
System.out.println("Enter the Details of Employe  :\n");
System.out.println("Enter the Employee Id :");
Scanner sc=new Scanner(System.in);
id=sc.nextInt();
System.out.println("Enter the Employee Name :");
Scanner sc1=new Scanner(System.in);
Name=sc1.nextLine();
System.out.println("Enter the Employee Address (City) :");
Scanner sc2=new Scanner(System.in);
Add=sc2.nextLine();
System.out.println("Enter the Employee Mobile :");
Scanner sc3=new Scanner(System.in);
Mobile=sc3.nextInt();


}
void display()
{
System.out.println("Employee Detail is :\n");
System.out.println("Employee ID :"+id);
System.out.println("Employee Name :"+Name);
System.out.println("Employee Address :"+Add);
System.out.println("Employee Mobile Number :"+Mobile+"\n");
    
}

}
class child3 extends child2
{

}

class hello
{
public static void main(String[] args)
{
 child c1=new child();
 child2 c2=new child2();
 child3 c3=new child3();
 c1.input();
 c1.display();   
 c2.input();
 c2.display();
 c3.input();
 c3.display(); 


}

}

