import java.util.Scanner;


public class TwoDArray 
{
    public static void main(String[] args) 
    {
        int col,row;
        
        //Taking Size input from user 

        System.out.println("Enter the size of matrix :\n");
        System.out.println("Enter Number of Rows :");
        Scanner sc1=new Scanner(System.in);
        row=sc1.nextInt();
        System.out.println("Enter Number of Columns");
        Scanner sc2=new Scanner(System.in);
        col=sc2.nextInt();

        //Declaring Array

        int a[][]=new  int[row][col];
        int transpose[][]=new int[row][col];
       

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println("Enter the elements in Matrix :["+i+"]["+j+"]");
                Scanner sc=new Scanner(System.in);
                a[i][j]=(int) sc.nextInt();
            }
        }
            
        System.out.println("Entered Matrix is :\n");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(" "+a[i][j]);
            
            }
            System.out.println();
        }
    
    //Transpose of matrix
    System.out.println("Transpose of Matrix is : \n");
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            transpose[i][j]=a[j][i];
        }
    }

    // Displaying Transpose Matrix 
    for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(" "+transpose[i][j]);
            
            }
            System.out.println();

         }
    
    }
}
